package com.tsl.mapper;

import java.util.List;

import com.tsl.po.GestroomPo;
import com.tsl.po.UserPo;

public interface GestroomMapper {

	public List<GestroomPo> findAllGestroom(GestroomPo gestroom);
	
	public List<GestroomPo> findRoomNum(GestroomPo gestroom);
	
	public GestroomPo findRoomPrice(GestroomPo gestroom);
	
	public List<String> findGr_name();
	
	public List<GestroomPo> findGestroomIsRepeat(GestroomPo gestroom);
	
	public int deleteOneGestroom(int id);
	
	public int addOneGestroom(GestroomPo gestroom);

}
