package com.lab3;

public class Engine {

	double size;
	String fuel;
	public Engine(double size, String fuel) {
		super();
		this.size = size;
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Engine [size=" + size + ", fuel=" + fuel + "]";
	}
	
}

