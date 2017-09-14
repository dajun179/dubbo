package com.hyitong.share.mapper.user;

import com.hyitong.share.transport.domain.pojo.sysuserDO;
import com.hyitong.share.transport.domain.pojo.sysuserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sysuserDOMapper {
    int countByExample(sysuserDOExample example);

    int deleteByExample(sysuserDOExample example);

    int deleteByPrimaryKey(String loginname);

    int insert(sysuserDO record);

    int insertSelective(sysuserDO record);

    List<sysuserDO> selectByExample(sysuserDOExample example);

    sysuserDO selectByPrimaryKey(String loginname);

    int updateByExampleSelective(@Param("record") sysuserDO record, @Param("example") sysuserDOExample example);

    int updateByExample(@Param("record") sysuserDO record, @Param("example") sysuserDOExample example);

    int updateByPrimaryKeySelective(sysuserDO record);

    int updateByPrimaryKey(sysuserDO record);
}