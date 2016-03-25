package com.ebaolife.service;

import java.util.List;

import com.ebaolife.model.Flight;
import com.ebaolife.model.SearchFlight;
import com.ebaolife.model.SpecialDeal;

public interface FlightService {
	List<SpecialDeal> getSpecialDeals();
	List<Flight> findFlights(SearchFlight search);
}
