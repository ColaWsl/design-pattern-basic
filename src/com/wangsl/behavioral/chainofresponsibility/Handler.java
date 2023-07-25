package com.wangsl.behavioral.chainofresponsibility;

public abstract class Handler {
	protected Handler nextHandler;

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract void handleRequest(int request);
}
