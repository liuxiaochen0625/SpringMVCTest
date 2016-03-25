package com.ebaolife.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Flight {
	private List<FlightLeg> legs;
	private BigDecimal totalCost;
	public Flight(List<FlightLeg> legs, BigDecimal totalCost) {
		super();
		this.legs = legs;
		this.totalCost = totalCost;
	}
	
	public List<FlightLeg> getLegs() {
		return legs;
	}
	
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	
	public boolean isNonStop(){
		return (legs.size() == 1);
	}
	
	private FlightLeg getFirstLeg(){
		return legs.get(0);
	}
	
	private FlightLeg getLastLeg(){
		return legs.get(legs.size()-1);
	}
	
	public Airport getDepartFrom(){
		return getFirstLeg().getDepartFrom();
	}
	
	public Airport getArriveAt(){
		return getFirstLeg().getArriveAt();
	}
	
	public int getNumbersOfLegs(){
		return legs.size();
	}
	
	public long getTotalTravelTime(){
		Date start = getFirstLeg().getDepartOn();
		Date end = getLastLeg().getArriveOn();
		return (end.getTime() - start.getTime());
	}
	
}
