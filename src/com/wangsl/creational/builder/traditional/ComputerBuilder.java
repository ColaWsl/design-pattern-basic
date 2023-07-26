package com.wangsl.creational.builder.traditional;


public abstract class ComputerBuilder {

	// non-must field setter
	public abstract void setUsbCount();
	public abstract void setKeyBoard();
	public abstract void setDisplay();

	// get instance
	public abstract Computer getComputer();
}
