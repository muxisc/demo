//package org.mybatis.generator.plugins;
//
//import org.mybatis.generator.api.IntrospectedColumn;
//import org.mybatis.generator.api.IntrospectedTable;
//import org.mybatis.generator.api.PluginAdapter;
//import org.mybatis.generator.api.dom.java.Interface;
//import org.mybatis.generator.api.dom.java.Method;
//import org.mybatis.generator.api.dom.java.TopLevelClass;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
///**
// * 1、Build -- Recompile编译成LombokPlugin.class
// * 2、E:\scDemo\demo\common\target\classes\org\mybatis\generator\plugins：
// * LombokPlugin.class 复制到
// * E:\haocui\repository\org\mybatis\generator\mybatis-generator-core\1.3.5：
// * mybatis-generator-core-1.3.5.jar中
// */
//public class LombokPlugin extends PluginAdapter {
//
//    public LombokPlugin() {
//    }
//
//
//    @Override
//    public boolean validate(List<String> list) {
//        return true;
//    }
//
//    @Override
//    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
//        topLevelClass.addImportedType("lombok.Data");
//        topLevelClass.addAnnotation("@Data");
//        //topLevelClass.addImportedType("lombok.Getter");
//        //topLevelClass.addImportedType("lombok.Setter");
//        //topLevelClass.addImportedType("lombok.ToString");
//        //topLevelClass.addAnnotation("@Getter");
//        //topLevelClass.addAnnotation("@Setter");
//        //topLevelClass.addAnnotation("@ToString");
//        //实体类的注释
//        //topLevelClass.addJavaDocLine("/**");
//        //topLevelClass.addJavaDocLine("* Created by Mybatis Generator " + this.dateToStr(new Date()));
//        //topLevelClass.addJavaDocLine("*/");
//        return true;
//    }
//
//    @Override
//    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
//        //mapper.java的注释
//        //interfaze.addJavaDocLine("/**");
//        //interfaze.addJavaDocLine("* Created by Mybatis Generator " + this.dateToStr(new Date()));
//        //interfaze.addJavaDocLine("*/");
//        return true;
//    }
//
//    @Override
//    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
//        return false;
//    }
//
//    @Override
//    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
//        return false;
//    }
//
//    private String dateToStr(Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//        return sdf.format(date);
//    }
//}
//
