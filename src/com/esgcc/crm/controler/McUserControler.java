package com.esgcc.crm.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class McUserControler {
	@RequestMapping("/login")
	public String login(){
		System.out.print("aaaaaaaaaaaaaaaaaa");
		System.out.print("bbbbbbbbbbbbbbbbbb");
		System.out.print("cccccccccccccccccc");
		System.out.print("cccccccccccccccccc");
		System.out.print("111111111111111111");	
		return "index";
	}
}
