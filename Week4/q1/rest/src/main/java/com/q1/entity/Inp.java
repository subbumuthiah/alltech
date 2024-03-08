package com.q1.entity;

public class Inp {

	public String statusQuery, dateStr;
	public int threshold;
	public Inp() {
		
	}
	public Inp(String statusQuery, String dateStr, int threshold) {
		this.statusQuery = statusQuery;
		this.dateStr = dateStr;
		this.threshold = threshold;
	}
	@Override
	public String toString() {
		return "Inp [statusQuery=" + statusQuery + ", dateStr=" + dateStr + ", threshold=" + threshold + "]";
	}
	public String getStatusQuery() {
		return statusQuery;
	}
	public void setStatusQuery(String statusQuery) {
		this.statusQuery = statusQuery;
	}
	public String getDateStr() {
		return dateStr;
	}
	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
}
