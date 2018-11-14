package com.tsl.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.po.UserPo;

public class LoginTest {

	@Test
	public void test() {
		String username="asd";
		String password="asd";
		UserPo user=new UserPo();
		user.setU_name(username);
		user.setU_pwd(password);
		UserDaoImpl loginDao=new UserDaoImpl();
		UserPo isLogin =loginDao.userLogin(user);
		System.out.println(isLogin);
	}

}
