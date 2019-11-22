package mapper.two;


import entity.two.FlowerEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FlowerMapper {

    @Select("SELECT * FROM flower")
    List<FlowerEntity> getList();

    FlowerEntity getById(@Param("id") Integer id);

}
