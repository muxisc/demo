package entity.one;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "generator_test")
public class GeneratorTest {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 日期（年月日）
     */
    @Column(name = "xxx_date")
    private Date xxxDate;

    /**
     * 时间（年月日 时分秒）
     */
    @Column(name = "xxx_time")
    private Date xxxTime;

    /**
     * 内容
     */
    private String context;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取日期（年月日）
     *
     * @return xxx_date - 日期（年月日）
     */
    public Date getXxxDate() {
        return xxxDate;
    }

    /**
     * 设置日期（年月日）
     *
     * @param xxxDate 日期（年月日）
     */
    public void setXxxDate(Date xxxDate) {
        this.xxxDate = xxxDate;
    }

    /**
     * 获取时间（年月日 时分秒）
     *
     * @return xxx_time - 时间（年月日 时分秒）
     */
    public Date getXxxTime() {
        return xxxTime;
    }

    /**
     * 设置时间（年月日 时分秒）
     *
     * @param xxxTime 时间（年月日 时分秒）
     */
    public void setXxxTime(Date xxxTime) {
        this.xxxTime = xxxTime;
    }

    /**
     * 获取内容
     *
     * @return context - 内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置内容
     *
     * @param context 内容
     */
    public void setContext(String context) {
        this.context = context;
    }
}