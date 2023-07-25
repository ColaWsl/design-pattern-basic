package com.wangsl.behavioral.command;

//调用者（调用命令对象执行请求）
public class RemoteControl {
	private Command command;

	public void setCommand(Command command){
		this.command = command;
	}

	public void pressButton(){
		command.execute();
	}
}
