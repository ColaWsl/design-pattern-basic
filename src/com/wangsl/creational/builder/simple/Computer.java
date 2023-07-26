package com.wangsl.creational.builder.simple;

public class Computer {
	private final String cpu; // must
	private final String ram; // must
	private final int usbCount; // non-must
	private final String keyBoard; // non-must
	private final String display; // non-must

	private Computer(Builder builder){
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.usbCount = builder.usbCount;
		this.keyBoard = builder.keyBoard;
		this.display = builder.display;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"cpu='" + cpu + '\'' +
				", ram='" + ram + '\'' +
				", usbCount=" + usbCount +
				", keyBoard='" + keyBoard + '\'' +
				", display='" + display + '\'' +
				'}';
	}

	// static inner class
	public static class Builder{
		private String cpu; // must
		private String ram; // must
		private int usbCount; // non-must
		private String keyBoard; // non-must
		private String display; // non-must

		// must
		public Builder(String cpu, String ram){
			this.cpu = cpu;
			this.ram = ram;
		}

		public Builder setUsbCount(int usbCount){
			this.usbCount = usbCount;
			return this;
		}

		public Builder setKeyBoard(String keyBoard){
			this.keyBoard = keyBoard;
			return this;
		}

		public Builder setDisplay(String display){
			this.display = display;
			return this;
		}

		public Computer build(){
			return new Computer(this);
		}
	}
}
