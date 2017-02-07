package me.pwcong.ssm.utils;

import java.util.UUID;

public class UUIDUtils {

	private UUIDUtils(){}
	
	public static String uuid(){
		
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replaceAll("-", "");
		return uuid;
	}

}
