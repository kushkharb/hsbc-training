package org.demo.toolsQ1;

public class Calculator {

	public int x,y;
	
	public Calculator(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int add() {
		return x+y;
	}
	public double multiply() {
		return x*y;
	}
	public int subtract() {
		return x-y;
	}
}
