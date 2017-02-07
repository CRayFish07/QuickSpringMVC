package me.pwcong.ssm.utils;

public class StringUtils {

	private StringUtils(){}

	public static boolean isNullOrEmpty(String str) {

		return null == str || str.isEmpty();

	}
	
	public static boolean equal(String s1,String s2){
		return s1.equals(s2);
	}

}
