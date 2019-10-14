package com.jiayiju.senior.week2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
	
	
	@RequestMapping()
	public String list() {
		
		
		return "list";
	}
}
