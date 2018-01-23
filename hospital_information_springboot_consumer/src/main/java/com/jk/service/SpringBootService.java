package com.jk.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SpringBootService {

	int findUserCount();

	List<Map<String, Object>> findUser(Integer startPos, Integer endPos);

	void del(String ids);

	void add(String userName, String userPwd, String userSex, Date parse, String userAge);

	List<Map<String, Object>> findOneUser(Integer id);

}
