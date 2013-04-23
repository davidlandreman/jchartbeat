package com.dispatch.chartbeat.responses;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author David Landreman
 *
 */
public class Stat {

	@SerializedName("history")
	private List<Integer> history;
	
	@SerializedName("avg")
	private double average;
	
	@SerializedName("median")
	private double median;
	
	public List<Integer> getHistory() {
		return history;
	}

	public void setHistory(List<Integer> history) {
		this.history = history;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}
	
}
