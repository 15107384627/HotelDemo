package com.tsl.dao;

import java.util.List;
import java.util.Map;

import com.tsl.po.PagePo;
import com.tsl.po.UserPo;

public interface UserDao {

	public UserPo userLogin(UserPo user);
	
	public List<UserPo> findAllUser(UserPo user);
	
	public List<UserPo> findUserIsRepeat(UserPo user);
	
	public int addOneUser(UserPo user);
	
	public int deleteOneUser(int id);
	
	public List<UserPo> findPageUser(Map<String, Object> map);
	
	public Integer getUserNum(PagePo page);
}
