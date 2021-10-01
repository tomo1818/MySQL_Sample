package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.UserInfo;
import com.example.demo.repository.UserInfoMapper;

@Controller
public class UserListController {
	
	@Autowired
	UserInfoMapper userInfoMapper;
	
	@RequestMapping("/list")
	public String getUserList(Model model) {
		List<UserInfo> userList = userInfoMapper.selectAll();
		model.addAttribute("userList", userList);
		return "list";
	}
}
