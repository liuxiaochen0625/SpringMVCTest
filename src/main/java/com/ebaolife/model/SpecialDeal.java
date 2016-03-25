package com.ebaolife.model;

import java.math.BigDecimal;
import java.util.Date;

public class SpecialDeal {
	private Airport departFrom;
	private Airport arriveAt;
	private Date beginOn;
	private Date endOn;
	private BigDecimal cost;
	public SpecialDeal(Airport departFrom, Airport arriveAt, Date beginOn,
			Date endOn, BigDecimal cost) {
		super();
		this.departFrom = departFrom;
		this.arriveAt = arriveAt;
		this.beginOn = new Date(beginOn.getTime());
		this.endOn = new Date(endOn.getTime());
		this.cost = cost;
	}
	public Airport getDepartFrom() {
		return departFrom;
	}
	public Airport getArriveAt() {
		return arriveAt;
	}
	public BigDecimal getCost() {
		return cost;
	}
	
	public boolean isValidNow(){
		return isValidOn(new Date());
	}
	
	public boolean isValidOn(Date date){
		Date dateCopy = new Date(date.getTime());
		return (dateCopy.equals(beginOn)||dateCopy.after(beginOn))&&((dateCopy.equals(endOn))||(dateCopy.before(endOn)));
	}
	@Override
	public String toString() {
		return "SpecialDeal [departFrom=" + departFrom + ", arriveAt="
				+ arriveAt + ", beginOn=" + beginOn + ", endOn=" + endOn
				+ ", cost=" + cost + "]";
	}
	
	
}
