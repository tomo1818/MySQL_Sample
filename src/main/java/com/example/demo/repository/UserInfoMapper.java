package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.UserInfo;

@Mapper
public interface UserInfoMapper {
	public List<UserInfo> selectAll();
}
