package com.tsl.daoimpl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tsl.dao.UserDao;
import com.tsl.po.PagePo;
import com.tsl.po.UserPo;
import com.tsl.utils.MybatisUtil;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	public UserPo userLogin(UserPo user){
		UserPo isUser=MybatisUtil.getSqlSession().selectOne("com.tsl.mapper.UserMapper.userLogin", user);
		return isUser;
		/*if(isUser!=null) {
			return true;
		}else {
			return false;
		}*/
	}

	@Override
	public List<UserPo> findAllUser(UserPo user) {
		List<UserPo> users=MybatisUtil.getSqlSession().selectList("com.tsl.mapper.UserMapper.findAllUser", user);
		return users;
	}

	@Override
	public int addOneUser(UserPo user) {
		SqlSession session=MybatisUtil.getSqlSession();
		int i=session.insert("com.tsl.mapper.UserMapper.addOneUser", user);
		session.commit();
		session.close();
		return i;
	}

	@Override
	public int deleteOneUser(int id) {
		SqlSession session=MybatisUtil.getSqlSession();
		int i=session.delete("com.tsl.mapper.UserMapper.deleteOneUser", id);
		session.commit();
		session.close();
		return i;
	}

	@Override
	public List<UserPo> findUserIsRepeat(UserPo user) {
		List<UserPo> users=MybatisUtil.getSqlSession().selectList("com.tsl.mapper.UserMapper.findUserIsRepeat", user);
		return users;
	}

	@Override
	public List<UserPo> findPageUser(Map<String, Object> map) {
		List<UserPo> users=MybatisUtil.getSqlSession().selectList("com.tsl.mapper.UserMapper.findPageUser", map);
		return users;
	}

	@Override
	public Integer getUserNum(PagePo page) {
		SqlSession session=MybatisUtil.getSqlSession();
		PagePo pagePo=session.selectOne("com.tsl.mapper.UserMapper.getUserNum", page);
		session.close();
		return pagePo.getNum();
	}
}
