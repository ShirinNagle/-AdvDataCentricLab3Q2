package com.lab3;

public class Car {
	
		String reg;
		int doors;
		String colour;
		Engine engine;
		public Car(String reg, int doors, String colour, Engine engine) {
			super();
			this.reg = reg;
			this.doors = doors;
			this.colour = colour;
			this.engine = engine;
		}
		@Override
		public String toString() {
			return "Car [reg=" + reg + ", doors=" + doors + ", colour=" + colour + ", engine=" + engine + "]";
		}
		
		


}
