package com.ginseng.miaosha.controller;

import com.ginseng.miaosha.rabbitmq.MQSender;
import com.ginseng.miaosha.redis.RedisService;
import com.ginseng.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")//注意！！！加了一个路径
public class MQueueController {
	@Autowired
	UserService userService;
	@Autowired
	RedisService redisService;
	@Autowired
	MQSender sender;
	
	
//	@RequestMapping("/mq")
//	@ResponseBody
//	public Result<String> mq() {//0代表成功
//		String message="hello ginseng!";
//		sender.send(message);
//		
//		return Result.success("hello sss");
//	}
//	
//	@RequestMapping("/mq/topic")
//	@ResponseBody
//	public Result<String> mqtopic() {//0代表成功
//		String message="hello t ginseng!";
//		sender.sendTopic(message);
//		
//		return Result.success("hello ginseng!");
//	}
//	
//	@RequestMapping("/mq/fanout")
//	@ResponseBody
//	public Result<String> mqfanout() {//0代表成功
//		String message="hello tff ginseng!";
//		sender.sendFanout(message);
//		
//		return Result.success("hello ginseng!");
//	}
//	
//	@RequestMapping("/mq/header")
//	@ResponseBody
//	public Result<String> mqheader() {//0代表成功
//		String message="hello header ginseng!";
//		sender.sendHeader(message);
//		
//		return Result.success("hello ginseng!");
//	}
	
}
