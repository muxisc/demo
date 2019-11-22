package mapper.one;

import entity.one.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper{

    @Select("SELECT * FROM user")
    List<UserEntity> getList();

    UserEntity getById(@Param("id") Integer id);

}
