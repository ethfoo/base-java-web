package com.ethfoo.demo.controller;

import com.ethfoo.demo.pojo.Demo;
import com.ethfoo.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fuyi1 on 2017/9/11.
 */
@Controller
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/demo/{id}")
	@ResponseBody
	public Demo demo(@PathVariable String id){
		Demo demo = new Demo();
		if (id.equals("111")){
			demo.setId("111");
			demo.setMsg("hello");
		}else {
			demo.setId("123456");
			demo.setMsg("world");
		}
		return demo;
	}
}
