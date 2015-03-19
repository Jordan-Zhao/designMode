package com.mode.command;

public class Main {
	public static void main(String[] arg){
		//创建命令
		Command openCommand = new OpenCommand();
		OpenReceiver openReceiver = new OpenReceiver();
		openCommand.setReceiver(openReceiver);
		
		//执行命令。命令的发出者和执行者之间解耦。
		CommandExecuter.execute(openCommand);
	}
}
