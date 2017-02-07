package me.pwcong.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.pwcong.ssm.dao.UserMapper;
import me.pwcong.ssm.entity.User;
import me.pwcong.ssm.service.UserService;
import me.pwcong.ssm.utils.DateUtils;
import me.pwcong.ssm.utils.StringUtils;
import me.pwcong.ssm.vo.UserVo;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	
	public User login(User user) throws Exception {
		
		User _user=null;
		_user=userMapper.findByUID(user.getUid());
		
		if(_user==null){
			throw new Exception("用户不存在");
		}
		
		if(!StringUtils.equal(_user.getPwd(), user.getPwd())){
			throw new Exception("密码错误");
		}
		
		return _user;
		
	}

	public User register(User user) throws Exception {
		
		if(StringUtils.isNullOrEmpty(user.getUid())|| StringUtils.isNullOrEmpty(user.getPwd())){
			throw new Exception("注册失败，用户名或密码不能为空");
		}
		
		
		User _user=userMapper.findByUID(user.getUid());
		if(_user!=null){
			throw new Exception("用户已存在");
		}

		user.setCreatedAt(DateUtils.time());
		user.setUpdatedAt(DateUtils.time());
		
		userMapper.add(new UserVo(user));
		
		return user;
	}

	
}
