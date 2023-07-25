package com.wangsl.behavioral.command.undo;

public class DeleteCommand implements Command{
	private Editor editor;
	private String text;

	public DeleteCommand(Editor editor, String text){
		this.editor = editor;
		this.text = text;
	}

	@Override
	public void execute() {
		editor.delete(text);
	}

	@Override
	public void undo() {
		editor.insert(text);
	}
}
