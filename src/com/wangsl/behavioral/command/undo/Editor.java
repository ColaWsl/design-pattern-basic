package com.wangsl.behavioral.command.undo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
	private StringBuilder content;
	private Deque<Command> history;
	private Deque<Command> redoHistory;

	public Editor(){
		this.content = new StringBuilder();
		this.history = new ArrayDeque<>();
		this.redoHistory = new ArrayDeque<>();
	}

	public void insert(String text){
		history.push(new InsertCommand(this, text));
		content.append(text);
	}

	public void delete(String text){
		int start = content.lastIndexOf(text);
		if(start != -1){
			String deletedText = content.substring(start, start + text.length());
			history.push(new DeleteCommand(this, deletedText));
			content.delete(start, start + text.length());
		}
	}

	// 撤销
	public void undo(){
		if(!history.isEmpty()){
			Command command = history.pop();
			redoHistory.push(command);
			command.undo();
		}
	}

	// 重做
	public void redo(){
		Command command = redoHistory.poll();
		command.undo();
	}

	public void printContent(){
		System.out.println("Current Content: " + content);
	}
}
