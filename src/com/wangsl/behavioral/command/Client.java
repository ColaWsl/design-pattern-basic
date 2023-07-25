package com.wangsl.behavioral.command;

public class Client {
	public static void main(String[] args) {
		// 创建接收者
		Light light = new Light();

		// 创建具体命令
		Command lightOnCommand = new LightOnCommand(light);

		// 创建调用者，并将命令对象传入
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(lightOnCommand);

		// 调用者执行命令
		remoteControl.pressButton();
	}
}
