package com.tsl.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.po.UserPo;

public class HotelTest {

	@Test
	public void test() {
		String gestroom="C:\\fakepath\\00.jpg";
		System.out.println(gestroom.toString());
		System.out.println(gestroom.substring(2));
		System.out.println(gestroom.indexOf("\\"));
		System.out.println(gestroom.lastIndexOf("\\"));
		System.out.println(gestroom.substring(gestroom.lastIndexOf("\\")+1));
	}

}
