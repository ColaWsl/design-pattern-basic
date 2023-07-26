package com.wangsl.creational.builder.traditional;


public class MacComputerBuilder extends ComputerBuilder{

	private Computer computer;
	public MacComputerBuilder(String cpu, String ram){
		computer = new Computer(cpu, ram);
	}

	@Override
	public void setUsbCount() {
		computer.setUsbCount(2);
	}

	@Override
	public void setKeyBoard() {
		computer.setKeyboard("LOGI");
	}

	@Override
	public void setDisplay() {
		computer.setDisplay("mac");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}
}
