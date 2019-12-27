package entity.one;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "generator_test")
@Data
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
}