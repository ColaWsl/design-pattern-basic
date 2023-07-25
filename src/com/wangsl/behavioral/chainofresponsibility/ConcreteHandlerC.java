package com.wangsl.behavioral.chainofresponsibility;

public class ConcreteHandlerC extends Handler{
	@Override
	public void handleRequest(int request) {
		if(request > 20){
			System.out.println("HandlerC process... :" + request);
		}else if(nextHandler != null){
			nextHandler.handleRequest(request);
		}
	}
}
