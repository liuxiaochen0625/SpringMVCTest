package com.ebaolife.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ebaolife.service.FlightService;

public class HomeController extends AbstractController{

	private static final int FIVE_MINUTES = 5*60;
	private FlightService flights;
	
	public HomeController() {
		setSupportedMethods(new String[]{METHOD_GET});
		setCacheSeconds(FIVE_MINUTES);
	}
	
	
	
	public void setFlights(FlightService flights) {
		this.flights = flights;
	}



	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("special",flights);
		return mav;
	}
}
