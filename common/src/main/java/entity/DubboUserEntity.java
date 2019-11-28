package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "dubbo_user")
public class DubboUserEntity implements Serializable {
    //注意：实体类需实现Serializable，不然会报错
    private static final long serialVersionUID = 1L;

    @Column(name = "us_id")
    private Integer usId;
    @Column(name = "us_name")
    private String usName;
    @Column(name = "us_age")
    private Integer usAge;

}
