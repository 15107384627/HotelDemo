package com.tsl.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tsl.dao.UserDao;
import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.mapper.UserMapper;
import com.tsl.po.UserPo;


@Controller
public class LoginController {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping(value="/login")
	public String login(HttpSession session,HttpServletRequest request) {
		session = request.getSession();
		if(session!=null) {
			session.removeAttribute("userName");
		}
		return "login";
	}

	@RequestMapping(value="/islogin")
	@ResponseBody
	public Boolean islogin(HttpSession session,HttpServletRequest request,@RequestBody UserPo user) {
		UserPo isLogin =userMapper.userLogin(user);
		if(isLogin!=null){
			session = request.getSession();
			session.setAttribute("userName", user.getU_name());
			return true;
		}else {
			return false;
		}
	}
}
