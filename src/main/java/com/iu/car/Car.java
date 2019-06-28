package com.iu.car;

public class Car {
	
	private Wheel wheel;
	
	public Car() {}
	
	//생성자를 통한 DI
	public Car(Wheel wheel) {
		this.wheel=wheel;
	}
	
	//메서드를 통한 DI
	public void setWheel(Wheel wheel) {
		this.wheel=wheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

}
