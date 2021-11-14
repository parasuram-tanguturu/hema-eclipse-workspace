package com.oops.bike;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducadi = new MotorBike();
		MotorBike honda = new MotorBike();
		ducadi.start();
		honda.start();
		System.out.println(ducadi.getage());

		ducadi.setSpeed(100);
		ducadi.increaseage(20);
		System.out.println(ducadi.getage());

		honda.setSpeed(10);
		System.out.println(honda.getage());
	}

}
