package com.hyitong.share.mapper.user;

import com.hyitong.share.transport.domain.pojo.userDO;
import com.hyitong.share.transport.domain.pojo.userDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userDOMapper {
    int countByExample(userDOExample example);

    int deleteByExample(userDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(userDO record);

    int insertSelective(userDO record);

    List<userDO> selectByExample(userDOExample example);

    userDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") userDO record, @Param("example") userDOExample example);

    int updateByExample(@Param("record") userDO record, @Param("example") userDOExample example);

    int updateByPrimaryKeySelective(userDO record);

    int updateByPrimaryKey(userDO record);
}