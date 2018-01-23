package com.jk.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SpringBootDao {

	@Select("SELECT COUNT(user_id) FROM t_user")
	int findUserCount();

	@Select("SELECT *FROM t_user LIMIT #{startPos},#{endPos}")
	List<Map<String, Object>> findUser(@Param("startPos") Integer startPos, @Param("endPos") Integer endPos);

	@Delete("DELETE FROM t_user WHERE user_id IN (${ids})")
	void del(@Param("ids") String ids);

	@Insert("INSERT INTO t_user(user_name,user_pwd,user_sex,user_age,user_birthday) VALUES(#{userName},#{userPwd},#{userSex},#{userAge},#{parse})")
	void add(@Param("userName") String userName, @Param("userPwd") String userPwd, @Param("userSex") String userSex, @Param("parse") Date parse, @Param("userAge") String userAge);

	@Select("SELECT *FROM t_user WHERE user_id=#{id}")
	List<Map<String, Object>> findOneUser(@Param("id") Integer id);

}
