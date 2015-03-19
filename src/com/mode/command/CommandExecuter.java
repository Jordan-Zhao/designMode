package com.mode.command;

/**
 * 命令执行者。不需要知道具体是怎么执行的。
 * @author jindong.zjd
 *
 */
public class CommandExecuter {
	public static void execute(Command command){
		command.execute();
	}
}
