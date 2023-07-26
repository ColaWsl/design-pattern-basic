package com.wangsl.creational.builder.traditional;

public class Computer {
	private String cpu; // must
	private String ram; // must
	private int usbCount; // non-must
	private String keyBoard; // non-must
	private String display; // non-must

	public Computer(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}
	public void setUsbCount(int usbCount) {
		this.usbCount = usbCount;
	}
	public void setKeyboard(String keyBoard) {
		this.keyBoard = keyBoard;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	@Override
	public String toString() {
		return "Computer{" +
				"cpu='" + cpu + '\'' +
				", ram='" + ram + '\'' +
				", usbCount=" + usbCount +
				", keyboard='" + keyBoard + '\'' +
				", display='" + display + '\'' +
				'}';
	}
}
