package com.vehicle;

public class Car extends Vehicle{

	boolean powerSteering;
	String fuelType;
	public Car(int vehicleNo, String engineStatus, int currentGear, boolean powerSteering, String fuelType) throws IncorrectInputException {
		super(vehicleNo, engineStatus, currentGear);
		// TODO Auto-generated constructor stub
		if(  (fuelType.equalsIgnoreCase("Gas") || fuelType.equalsIgnoreCase("Petrol") || fuelType.equalsIgnoreCase("Diesel")) == false){
			throw new IncorrectInputException("Fuel type must be Gas, Diesel, or Petrol");
		}
		this.powerSteering = powerSteering;
		this.fuelType = fuelType;
	}

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void showCarDetails(){
		System.out.println("*************");
		System.out.println("The Vehicle Number is: "+this.vehicleNo);
		System.out.println("The Engine Status is: "+this.engineStatus);
		System.out.println("The Current Gear is: "+this.currentGear);
		System.out.println("Power Steering: "+this.powerSteering);
		System.out.println("The Fuel Type is: "+this.fuelType);
		System.out.println("*************");
	}
	@Override
	void ignite() {
		// TODO Auto-generated method stub
		this.engineStatus = "On";
		this.currentGear = 1;
	}

	@Override
	int changeGear(int flag) {
		// TODO Auto-generated method stub
		switch(flag){
		case 1:
			if(this.currentGear <= 5 && this.currentGear >= 0){
				this.currentGear++;
			} else if(this.currentGear == 6){
				this.currentGear = 6;
			}
			break;
		case -1:
			if(this.currentGear > 1 && this.currentGear <= 6){
				this.currentGear--;
			} else if(this.currentGear == 1){
				this.currentGear = 1;
			}
			break;
		}
		return 0;
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		this.engineStatus = "Off";
		this.currentGear = 0;
		
	}

}
