package com.wangsl.behavioral.command.undo;

public interface Command {
	void execute();
	void undo();
}
