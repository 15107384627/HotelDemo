package com.tsl.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.po.PagePo;
import com.tsl.po.UserPo;

public class UserTest {

	@Test
	public void test() {
		Map<String, Object> map=new HashMap<>();
		map.put("start", 0);
		map.put("rows", 3);
//		map.put("u_name", "a");
		PagePo page=new PagePo();
		UserDaoImpl userDao=new UserDaoImpl();
		int i=userDao.getUserNum(null);
		System.out.println(i);
//		List<UserPo> users=userDao.findPageUser(map);
//		System.out.println(users.toString());
	}

}
