package com.hx.push;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nl.justobjects.pushlet.core.Dispatcher;
import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;


/**
 * 这里边都是一些前往页面，各种的管理和测试页面，
 * 注意：人工推送的页面的方法都是push开头
 * 	   测试推送的页面的方法都是以test开头
 * @author zyq
 *
 * 2016年12月5日
 */
@Controller
@RequestMapping("/servlet")
public class ServletController {
	
	//前往一个各种链接的页面，包含各种管理也测试页面，下边就是他们的方法
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String toLogin(HttpServletRequest request) {
		return "/index";
	}
	
	
	
	//创建pushlet，在页面中创建连接，此功能的性能压力有待测定
	@RequestMapping(value = "/toCreatePushlet", method = RequestMethod.GET)
	public String toCreatePushlet(HttpServletRequest request) {
		return "/toCreatePushlet";
	}
	
	//进行推送
	@RequestMapping(value = "/pushlet", method = RequestMethod.GET)
	public void pushlet(HttpServletRequest request) {
		Event event =Event.createDataEvent("/cuige/eeeeeeeee");
		event.setField("mess", "hello,world!Plushlet!");


		
        Dispatcher.getInstance().multicast(event);  
	}
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}
