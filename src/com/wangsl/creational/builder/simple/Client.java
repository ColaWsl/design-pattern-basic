package com.wangsl.creational.builder.simple;

public class Client {
	public static void main(String[] args) {
		Computer computer = new Computer.Builder("intel", "SAN")
				.setDisplay("Logi")
				.setKeyBoard("Logi")
				.setUsbCount(12)
				.build();

		System.out.println(computer);
	}
}
