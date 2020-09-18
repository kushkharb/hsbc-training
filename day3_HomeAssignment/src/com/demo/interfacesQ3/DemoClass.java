package com.demo.interfacesQ3;

public class DemoClass implements SecondInterface {

	@Override
	public String show1() {
		return "wow " +FirstInterface.demo1;
	}

	@Override
	public String show2() {
		return "wow " +SecondInterface.demo2;
	}

}
