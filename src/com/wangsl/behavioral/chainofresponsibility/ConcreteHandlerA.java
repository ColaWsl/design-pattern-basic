package com.wangsl.behavioral.chainofresponsibility;

public class ConcreteHandlerA extends Handler{
	@Override
	public void handleRequest(int request) {
		if(request <= 10){
			System.out.println("HandlerA process... :" + request);
		}else if(nextHandler != null){
			nextHandler.handleRequest(request);
		}
	}
}
