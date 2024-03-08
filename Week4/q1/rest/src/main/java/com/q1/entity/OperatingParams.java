package com.q1.entity;

public class OperatingParams {

	private int rotorSpeed, slack;
	private float rootThreshold;
	public OperatingParams() {
		super();
	}
	public int getRotorSpeed() {
		return rotorSpeed;
	}
	public void setRotorSpeed(int rotorSpeed) {
		this.rotorSpeed = rotorSpeed;
	}
	public int getSlack() {
		return slack;
	}
	public void setSlack(int slack) {
		this.slack = slack;
	}
	public float getRootThreshold() {
		return rootThreshold;
	}
	public void setRootThreshold(float rootThreshold) {
		this.rootThreshold = rootThreshold;
	}
	public OperatingParams(int rotorSpeed, int slack, float rootThreshold) {
		super();
		this.rotorSpeed = rotorSpeed;
		this.slack = slack;
		this.rootThreshold = rootThreshold;
	}
	@Override
	public String toString() {
		return "OperatingParams [rotorSpeed=" + rotorSpeed + ", slack=" + slack + ", rootThreshold=" + rootThreshold
				+ "]";
	}
}
