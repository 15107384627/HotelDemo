package com.tsl.mapper;

import java.util.List;
import java.util.Map;

import com.tsl.po.PagePo;
import com.tsl.po.ReserveRoomPo;

public interface ReserveRoomMapper {

	public List<ReserveRoomPo> findAllReserveRoom(Map<String, Object> map);
	
	public List<ReserveRoomPo> findReserveRoomIsRepeat(ReserveRoomPo reserveRoom);
	
	public int deleteOneReserveRoom(int id);
	
	public int addOneReserveRoom(ReserveRoomPo reserveRoom);
	
	public Integer getReserveNum(PagePo page);
}
