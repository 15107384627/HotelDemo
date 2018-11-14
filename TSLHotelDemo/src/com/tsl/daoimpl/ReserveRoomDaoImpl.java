package com.tsl.daoimpl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tsl.dao.ReserveRoomDao;
import com.tsl.po.PagePo;
import com.tsl.po.ReserveRoomPo;
import com.tsl.utils.MybatisUtil;

@Repository("reserveRoomDao")
public class ReserveRoomDaoImpl implements ReserveRoomDao {

	@Override
	public List<ReserveRoomPo> findAllReserveRoom(Map<String, Object> map) {
		SqlSession session=MybatisUtil.getSqlSession();
		List<ReserveRoomPo> list=session.selectList("com.tsl.mapper.ReserveRoomMapper.findAllReserveRoom", map);
		return list;
	}
	
	@Override
	public Integer getReserveNum(PagePo page) {
		SqlSession session=MybatisUtil.getSqlSession();
		PagePo pagePo=session.selectOne("com.tsl.mapper.ReserveRoomMapper.getReserveNum", page);
		session.close();
		return pagePo.getNum();
	}

	@Override
	public List<ReserveRoomPo> findReserveRoomIsRepeat(ReserveRoomPo reserveRoom) {
		SqlSession session=MybatisUtil.getSqlSession();
		List<ReserveRoomPo> list=session.selectList("com.tsl.mapper.ReserveRoomMapper.findReserveRoomIsRepeat", reserveRoom);
		return list;
	}

	@Override
	public int deleteOneReserveRoom(int id) {
		SqlSession session=MybatisUtil.getSqlSession();
		int i=session.delete("com.tsl.mapper.ReserveRoomMapper.deleteOneReserveRoom", id);
		session.commit();
		session.close();
		return i;
	}

	@Override
	public int addOneReserveRoom(ReserveRoomPo reserveRoom) {
		SqlSession session=MybatisUtil.getSqlSession();
		int i=session.insert("com.tsl.mapper.ReserveRoomMapper.addOneReserveRoom", reserveRoom);
		session.commit();
		session.close();
		return i;
	}

}
