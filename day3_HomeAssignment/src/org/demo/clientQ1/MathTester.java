package org.demo.clientQ1;

import org.demo.toolsQ1.Calculator;

public class MathTester {

	public static void main(String[] args) {
			
		Calculator c =new Calculator(20,40);
		System.out.println("addinton of 20 & 40 is "+c.add());
		System.out.println("Multipication of 20 & 40 is "+c.multiply());
		System.out.println("substraction of 20 & 40 is "+c.subtract());
	}

}
