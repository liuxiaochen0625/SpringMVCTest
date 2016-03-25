package com.ebaolife.model;

import java.util.Date;

public class FlightLeg {
	private Airport departFrom;
	private Airport arriveAt;
	private Date departOn;
	private Date arriveOn;
	public FlightLeg(Airport departFrom, Airport arriveAt, Date departOn,
			Date arriveOn) {
		super();
		this.departFrom = departFrom;
		this.arriveAt = arriveAt;
		this.departOn = departOn;
		this.arriveOn = arriveOn;
	}
	public Airport getDepartFrom() {
		return departFrom;
	}
	public Airport getArriveAt() {
		return arriveAt;
	}
	public Date getDepartOn() {
		return departOn;
	}
	public Date getArriveOn() {
		return arriveOn;
	}
	
}
