package com.tsl.controller;

import java.io.File;
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
import org.springframework.web.multipart.MultipartFile;

import com.tsl.config.Config;
import com.tsl.dao.GestroomDao;
import com.tsl.dao.ReserveRoomDao;
import com.tsl.dao.UserDao;
import com.tsl.daoimpl.GestroomDaoImpl;
import com.tsl.daoimpl.ReserveRoomDaoImpl;
import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.mapper.GestroomMapper;
import com.tsl.mapper.ReserveRoomMapper;
import com.tsl.po.GestroomPo;
import com.tsl.po.ReserveRoomPo;
import com.tsl.po.UserPo;
import com.tsl.utils.FileUtil;

@Controller
@RequestMapping(value="/reserveRoom")
public class ReserveRoomController {
	
	@Autowired
	private ReserveRoomMapper reserveRoomMapper;
	@Autowired
	private GestroomMapper gestroomMapper;
	
	@RequestMapping(value="/info")
	public String info(Map<String, Object> map,Integer page) {
		int start = 0;
		if(page!=null&&page!=0){
			start = (page-1)*3; 
		}else{
			page=1;
		}
		
		Map<String, Object> mapData=new HashMap<>();
		mapData.put("start", start);
		mapData.put("rows", 3);
		List<ReserveRoomPo> reserveRooms=reserveRoomMapper.findAllReserveRoom(mapData);
		
		int pageNum =reserveRoomMapper.getReserveNum(null);

		map.put("reserveRooms", reserveRooms);
		map.put("page", page);
		map.put("pageNum", pageNum%3==0?pageNum/3:pageNum/3+1);
		return "reserveRoomInfo";
	}
	
	@RequestMapping(value="/add")
	public String add(Map<String, Object> map) {
		List<String> roomTypes=gestroomMapper.findGr_name();
		System.out.println(roomTypes);
		map.put("roomTypes", roomTypes);
		return "reserveRoomAdd";
	}
	@RequestMapping(value="/getRoomNums")
	@ResponseBody
	public List<GestroomPo> getRoomNum(Map<String, Object> map,GestroomPo  gestroom ) {
		List<GestroomPo> rooms =gestroomMapper.findRoomNum(gestroom);
		//[{"id":1,"gr_name":"biaozhunjian"},{}]
		return rooms;
	}
	
	@RequestMapping(value="/getRoomPrice")
	@ResponseBody
	public GestroomPo getRoomPrice(Map<String, Object> map,GestroomPo  gestroom) {
		GestroomPo price =gestroomMapper.findRoomPrice(gestroom);
		//[{"id":1,"gr_name":"biaozhunjian"},{}]
		return price;
	}
	
	//start
	@RequestMapping(value="/reserveRoomAdd")
	@ResponseBody
	public boolean reserveRoomAdd() {
		return false;
	}
	
	@RequestMapping(value="/reserveRoomDel")
	@ResponseBody
	public boolean delete(GestroomPo gestroom) {
		return false;
	}
}
