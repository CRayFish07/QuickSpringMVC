package me.pwcong.ssm.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.pwcong.ssm.entity.User;
import me.pwcong.ssm.service.UserService;

@Controller
public class UserController extends BaseController{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/user/login.action",method=RequestMethod.POST)
	public @ResponseBody Response login(@RequestBody User user){
		
		try {
			User login = userService.login(user);
			return new Response(OK, "登录成功", login);
		} catch (Exception e) {
			logger.error("login",e);
			return new Response(ERROR, "登录失败", null);
		}
	}
	
	
	@RequestMapping(value="/user/register.action",method=RequestMethod.POST)
	public @ResponseBody Response register(@RequestBody User user){
		
		try {
			User register = userService.register(user);
			return new Response(OK,"注册成功",register);
		} catch (Exception e) {
			logger.error("register",e);
			return new Response(ERROR, e.getMessage(), null);
		}
		
	}
	
	
}
