package com.fssa.glossyblends.model.Artist;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class schedule {

	private LocalDate date;
	private String eventName;
	private LocalDateTime timeOfEvent;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public LocalDateTime getTimeOfEvent() {
		return timeOfEvent;
	}
	public void setTimeOfEvent(LocalDateTime timeOfEvent) {
		this.timeOfEvent = timeOfEvent;
	}
	
}
