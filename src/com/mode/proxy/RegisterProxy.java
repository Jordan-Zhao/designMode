package com.mode.proxy;

public class RegisterProxy implements Register{
	public int register(){
		//发送http请求到远程注册服务器，注册服务器通过RegisterImpl对象注册用户，然后返回请求
		//int uid = doHttpRequest("register");
		//return uid;
		return 0;
	}
}
