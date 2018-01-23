package com.jk.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.SpringBootDao;
import com.jk.service.SpringBootService;

@Service("springBootService")
public class SpringBootServiceImpl implements SpringBootService{

	@Autowired
	private SpringBootDao springBootDao;

	@Override
	public int findUserCount() {
		return springBootDao.findUserCount();
	}

	@Override
	public List<Map<String, Object>> findUser(Integer startPos, Integer endPos) {
		return springBootDao.findUser(startPos,endPos);
	}

	@Override
	public void del(String ids) {
		springBootDao.del(ids);
	}

	@Override
	public void add(String userName, String userPwd, String userSex, Date parse, String userAge) {
		springBootDao.add(userName,userPwd,userSex,parse,userAge);
	}

	@Override
	public List<Map<String, Object>> findOneUser(Integer id) {
		return springBootDao.findOneUser(id);
	}

	
}
