package com.yaohuijin.java.designpattern.factorypattern;

public class MilMethodHumanFactory {

	public Human createMan() {
		return new Man();
	}

	public Human createWoman() {
		return new Woman();
	}
}
