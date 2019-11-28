package mapper;

import entity.DubboUserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DubboUserMapper {

    DubboUserEntity getUser(@Param("usId") Integer usId);

}
