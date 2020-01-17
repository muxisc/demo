package utils.encrypt;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;

//php对接java的AES-128-CBC加解密
public class AES {

    private static final String KEY = "cx.xz.zyc.com";
    private static final String IV = "sc1996";
    private static final String IV_STRING = eccryptMD5(IV);


    //加密
    public static String encryptAES(String content, String key) {
        try {
            byte[] byteContent = content.getBytes("UTF-8");
            byte[] enCodeFormat = key.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(enCodeFormat, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IV_STRING.getBytes());
            // 指定加密的算法、工作模式和填充方式
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] encryptedBytes = cipher.doFinal(byteContent);
            // 同样对加密后数据进行 base64 编码
            Base64.Encoder encoder = Base64.getEncoder();
            return encoder.encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decryptAES(String content, String key) {
        try {
            // base64 解码
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] encryptedBytes = decoder.decode(content);
            byte[] enCodeFormat = key.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(enCodeFormat, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IV_STRING.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] result = cipher.doFinal(encryptedBytes);
            return new String(result, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String content = "sc_18266606666";
        //php提供的key需截取前16位
        String key = KEY.substring(0,16);
        System.out.println("明文：" + content);

        String encode = encryptAES(content, key);
        System.out.println("加密后：" + encode);

        String decode = decryptAES(encode, key);
        System.out.println("解密后：" + decode);
    }

    //md5加密 获取32位，然后截取前16位
    private static String eccryptMD5(String context){
        try {
            //根据MD5算法生成MessageDigest对象
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] srcBytes = context.getBytes();
            //使用srcBytes更新摘要
            md5.update(srcBytes);
            //完成哈希计算，得到result
            byte[] resultBytes = md5.digest();
            return byteArrToHexStr(resultBytes).substring(0,16);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //字节数组转字符串
    private static String byteArrToHexStr(byte[] arrB){
        int iLen = arrB.length;
        StringBuffer sb = new StringBuffer(iLen * 2);
        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            if (intTmp < 16) {
                sb.append(0);
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }
}

