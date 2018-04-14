package com.ethfoo.demo.service.impl;

import com.ethfoo.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by fuyi1 on 2017/9/11.
 */
@Service
public class DemoServiceImpl implements DemoService{
	@Override
	public String getDemo() {
		return "hello";
	}
}
