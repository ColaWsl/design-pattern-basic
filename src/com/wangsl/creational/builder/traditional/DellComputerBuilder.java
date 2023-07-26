package com.wangsl.creational.builder.traditional;


public class DellComputerBuilder extends ComputerBuilder{

	private Computer computer;
	public DellComputerBuilder(String cpu, String ram){
		computer = new Computer(cpu, ram);
	}

	@Override
	public void setUsbCount() {
		computer.setUsbCount(4);
	}

	@Override
	public void setKeyBoard() {
		computer.setKeyboard("Dell");
	}

	@Override
	public void setDisplay() {
		computer.setDisplay("Dell");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}
}
