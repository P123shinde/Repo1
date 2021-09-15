package com.lti.model;

public class Filght {
	int flightId;
	String source;
	String destination;

	public Filght(int flightId, String source, String destination) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
