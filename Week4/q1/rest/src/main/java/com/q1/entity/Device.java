package com.q1.entity;

public class Device {

	private int id;
	private long timestamp;
	private String status;
	private OperatingParams operatingParams;
	private Asset asset;
	private Parent parent;
	public Device() {
		super();
	}
	public Device(int id, int timestamp, String status, OperatingParams operatingParams, Asset asset, Parent parent) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.status = status;
		this.operatingParams = operatingParams;
		this.asset = asset;
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", timestamp=" + timestamp + ", status=" + status + ", operatingParams="
				+ operatingParams + ", asset=" + asset + ", parent=" + parent + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OperatingParams getOperatingParams() {
		return operatingParams;
	}
	public void setOperatingParams(OperatingParams operatingParams) {
		this.operatingParams = operatingParams;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
}
