package com.tsl.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.sun.org.apache.xml.internal.security.Init;
import com.tsl.dao.GestroomDao;
import com.tsl.dao.ReserveRoomDao;
import com.tsl.daoimpl.GestroomDaoImpl;
import com.tsl.daoimpl.ReserveRoomDaoImpl;
import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.po.GestroomPo;
import com.tsl.po.PagePo;
import com.tsl.po.ReserveRoomPo;
import com.tsl.po.UserPo;


public class Test2 {

	
	@Test
	public void test() {
//		Map<String, Object> map=new HashMap<>();
//		map.put("start", 0);
//		map.put("rows", 3);
//		map.put("u_name", "a");
//		ReserveRoomDao reserveRoomDao=new ReserveRoomDaoImpl();
//		List<ReserveRoomPo> reserveRooms=reserveRoomDao.findAllReserveRoom(map);
//		int i=reserveRoomDao.getReserveNum(null);
//		System.out.println(i);
//		GestroomPo gestroom=new GestroomPo();
//		gestroom.setGr_name("group by gr_name");
//		GestroomDao gestroomDao =new GestroomDaoImpl();
//		List<String> gestrooms=gestroomDao.findGr_name();
//		System.out.println(gestrooms.toString());
		String a= this.getClass().getClassLoader().getResource("").getPath();
		String b= Init.class.getClassLoader().getResource("./").getPath();
		System.out.println(a);
		System.out.println(b);
	}

}
