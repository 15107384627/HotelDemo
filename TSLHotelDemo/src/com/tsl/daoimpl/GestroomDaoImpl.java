package com.tsl.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tsl.dao.GestroomDao;
import com.tsl.po.GestroomPo;
import com.tsl.utils.MybatisUtil;

@Repository("gestroomDao")
public class GestroomDaoImpl implements GestroomDao {

	@Override
	public List<GestroomPo> findAllGestroom(GestroomPo gestroom) {
		List<GestroomPo> gestrooms=MybatisUtil.getSqlSession().selectList("com.tsl.mapper.GestroomMapper.findAllGestroom",gestroom);
		return gestrooms;
	}
	@Override
	public List<GestroomPo> findRoomNum(GestroomPo gestroom) {
		List<GestroomPo> gestrooms=MybatisUtil.getSqlSession().selectList("com.tsl.mapper.GestroomMapper.findRoomNum",gestroom);
		return gestrooms;
	}
	@Override
	public int deleteOneGestroom(int id) {
		SqlSession session=MybatisUtil.getSqlSession();
		int i=session.delete("com.tsl.mapper.GestroomMapper.deleteOneGestroom", id);
		session.commit();
		session.close();
		return i;
	}

	@Override
	public int addOneGestroom(GestroomPo gestroom) {
		SqlSession session=MybatisUtil.getSqlSession();
		int i=session.insert("com.tsl.mapper.GestroomMapper.addOneGestroom", gestroom);
		session.commit();
		session.close();
		return i;
	}

	@Override
	public List<GestroomPo> findGestroomIsRepeat(GestroomPo gestroom) {
		List<GestroomPo> gestrooms=MybatisUtil.getSqlSession().selectList("com.tsl.mapper.GestroomMapper.findGestroomIsRepeat",gestroom);
		return gestrooms;
	}

	@Override
	public List<String> findGr_name() {
		List<String> gr_names=MybatisUtil.getSqlSession().selectList("com.tsl.mapper.GestroomMapper.findGr_name");
		return gr_names;
	}
}
