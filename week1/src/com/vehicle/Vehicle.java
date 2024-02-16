package com.vehicle;

import day2.InvalidInputException;

public abstract class Vehicle {
	int vehicleNo;
	String engineStatus;
	int currentGear;
	
	public Vehicle(int vehicleNo, String engineStatus, int currentGear) throws IncorrectInputException{
		this.vehicleNo = vehicleNo;
		this.currentGear = currentGear;
		if( (engineStatus.equalsIgnoreCase("On") || engineStatus.equalsIgnoreCase("Off")) == false){
			throw new IncorrectInputException("Engine status must be on or off");
		}
		this.engineStatus = engineStatus;
		
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(String engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	
	abstract void ignite();
	abstract int changeGear(int flag);
	abstract void stop();
}
