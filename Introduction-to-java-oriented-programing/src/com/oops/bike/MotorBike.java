package com.oops.bike;

public class MotorBike {

	private int age;

	// behaviour
	// input = int speed

	// output= void

	// name= set spped

	void setSpeed(int age) {
		if (age > 0) {
			this.age= age;
			
		}
	}

	void start() {
		System.out.println("Motor Bik startinge");
	}

	int getage() {
		return age;
	}

	void increaseage(int howMuch) {
		this.age += howMuch;

	}
}
