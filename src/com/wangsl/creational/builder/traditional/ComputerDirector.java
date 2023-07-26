package com.wangsl.creational.builder.traditional;

public class ComputerDirector {

	public void makeComputer(ComputerBuilder builder){
		builder.setUsbCount();
		builder.setDisplay();
		builder.setKeyBoard();
	}

	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector();
		ComputerBuilder builder = new DellComputerBuilder("intel", "arm");
		director.makeComputer(builder);

		Computer dellComputer = builder.getComputer();
		System.out.println(dellComputer.toString());

		ComputerBuilder builder1 = new MacComputerBuilder("mac", "mac");
		director.makeComputer(builder1);

		Computer macComputer = builder1.getComputer();
		System.out.println(macComputer);
	}
}
