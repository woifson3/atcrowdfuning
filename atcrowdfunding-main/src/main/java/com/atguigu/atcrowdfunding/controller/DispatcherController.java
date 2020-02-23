package com.atguigu.atcrowdfunding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.mapper.TMemberMapper;

@Controller
public class DispatcherController {
	
	@Autowired
	TMemberMapper memberMapper;
	
	@RequestMapping(value= {"/" ,"/index" , "/index.html"})
	public String toIndexPage() {
		System.out.println(memberMapper);
		return "index";
	}
}
