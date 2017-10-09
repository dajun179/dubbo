package com.lb.mapper.user;

import com.lb.user.domain.pojo.SysUserDO;

public interface SysUserMapper {
	
	 /**
     * 插入用户记录
     * @param record
     * @return
     */
    int insertSysUser(SysUserDO record);
    
//    /**
//     * 更新用户记录
//     * @param record
//     * @return
//     */
//    int saveSysUserDO(SysUserDO record);
//
//    /**
//     * 更新用户状态
//     * @param map
//     * @return
//     */
//    int saveSysUserDOStatus(Map<?, ?> map);
//    
//	/**
//	 * 依据搜索条件搜索用户数量
//	 * @param map
//	 * @return
//	 */
//    int selectCountByCondition(Map<?, ?> map);
//    
//    /**
//     * 依据搜索条件用户记录
//     * @param map
//     * @return
//     */
//    List<SysUserDO> selectByCondition(Map<?, ?> map);
    
    /**
     * 根据loginName获取用户记录
     * @param memberhscode
     * @return
     */
    SysUserDO getSysUserByloginName(String loginName);
    
}
