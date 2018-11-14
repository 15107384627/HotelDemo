package com.tsl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tsl.dao.UserDao;
import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.mapper.UserMapper;
import com.tsl.po.UserPo;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping(value="/info")
	public String info(HttpSession session,HttpServletRequest request,String username,Integer page) {
		int start = 0;
		if(page!=null&&page!=0){
			start = (page-1)*3; 
		}else{
			page=1;
		}
		
		Map<String, Object> map=new HashMap<>();
		map.put("start", start);
		map.put("rows", 3);
		map.put("u_name", username);
		List<UserPo> users=userMapper.findPageUser(map);
//		System.out.println(users.toString()+"+++++++");
		
		int pageNum =userMapper.getUserNum(null);
//		if(pageNum%3==0) {
//			pageNum=pageNum/3;
//		}else {
//			pageNum=pageNum/3+1;
//		}
//		System.out.println("=====page"+page);
//		System.out.println("=====pageNum"+pageNum);
		request.setAttribute("users", users);
		request.setAttribute("page", page);
		request.setAttribute("pageNum", pageNum%3==0?pageNum/3:pageNum/3+1);
		return "userinfo";
	}
	
	@RequestMapping(value="/add")
	public String add() {
		return "useradd";
	}
	
	@RequestMapping(value="/useradd")
	@ResponseBody
	public boolean useradd(UserPo user) {
		System.out.println("=========="+user.toString());
		List<UserPo> users=userMapper.findUserIsRepeat(user);
		if(users.size()<=0) {
			int i=userMapper.addOneUser(user);
			System.out.println("添加了"+i+"条数据");
			return true;
		}
		return false;
	}
	
	@RequestMapping(value="/userdel")
	@ResponseBody
	public boolean delete(UserPo user) {
		if(user!=null&&user.getId()!=0) {
			int i=userMapper.deleteOneUser(user.getId());
			System.out.println("删除了"+i+"条数据");
		}
		return true;
	}
}
