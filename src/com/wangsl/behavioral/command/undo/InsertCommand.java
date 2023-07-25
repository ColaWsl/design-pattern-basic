package com.wangsl.behavioral.command.undo;

public class InsertCommand implements Command{
	private Editor editor;
	private String text;

	public InsertCommand(Editor editor, String text){
		this.editor = editor;
		this.text = text;
	}

	@Override
	public void execute() {
		editor.insert(text);
	}

	@Override
	public void undo() {
		editor.delete(text);
	}
}
