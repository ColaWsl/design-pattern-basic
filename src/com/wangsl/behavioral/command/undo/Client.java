package com.wangsl.behavioral.command.undo;

public class Client {
	public static void main(String[] args) {
		Editor editor = new Editor();

		editor.insert("hello, ");
		editor.printContent();

		editor.insert("world!");
		editor.printContent();

		editor.undo();
		editor.printContent();

		editor.undo();
		editor.printContent();
	}
}
