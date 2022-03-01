package com.abs;

public class Fully_Abstraction3 implements Partial_Abstraction,Partial_Abstraction2{

	@Override
	public void name() {
		System.out.println("shshs");
		
	}

	@Override
	public void gender() {
		System.out.println("male");
		
	}

	@Override
	public void email() {
		System.out.println("siva@123");
		
	}

	@Override
	public void pass() {
		System.out.println("123");
	}
	public static void main(String[] args) {
		Fully_Abstraction3 k = new Fully_Abstraction3();
		k.name();
		k.email();
		k.pass();
		k.gender();
	}

}
