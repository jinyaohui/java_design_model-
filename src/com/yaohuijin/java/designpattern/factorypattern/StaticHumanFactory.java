package com.yaohuijin.java.designpattern.factorypattern;

public class StaticHumanFactory {

	public static Human createMan() {
		return new Man();
	}

	public static Human createWoman() {
		return new Woman();
	}
}
