    

	
package com.ysx.w2ar.base.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author bleach
 *
 */
 
 
@Controller
@RequestMapping(value="/web")
public class WebBaseController {

	@RequestMapping(value = "proccess")
	public String callback(HttpServletRequest request,HttpServletResponse response, String signature,String timestamp,
			String nonce,String echostr) {
		System.out.println("请求进来了");
		return "redirect:http://52ar.org/test/index.html";
	}

}



