package com.fssa.glossyblends.Validator;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fssa.glossyblends.model.Artist.ErrorMessages;
import com.fssa.glossyblends.model.Artist.schedule;

public class ScheduleValidations {

	public boolean ValidatorSchedule(schedule listOfSchedule) throws IllegalArgumentException {

		if (listOfSchedule == null) {

			throw new IllegalArgumentException("dfghjklknbvc");

		} else {
			validateName(listOfSchedule.getEventName());
			validateDate(listOfSchedule.getDate());
			validateTimeOfEvent(listOfSchedule.getTimeOfEvent());

		}

		return false;
	}

	public static boolean validateName(String eventname) throws IllegalArgumentException {

		if (eventname == null) {

			throw new IllegalArgumentException(ErrorMessages.INVALI_EVENT_NAME_NULL);

		}

		ArtistNameValidations.validateName(eventname);
		return true;
	}

	public static boolean validateDate(LocalDate date) throws IllegalArgumentException {
		if (date == null) {
			throw new IllegalArgumentException(ErrorMessages.DATE_EVENT_NAME_NULL);
		}
		LocalDate currentDate = LocalDate.now();

		if (date.isBefore(currentDate)) {
			throw new IllegalArgumentException(ErrorMessages.DATE_EVENT_PASSED);
		}
		return true;

	}

	public static boolean validateTimeOfEvent(LocalDateTime timeOfEvent) throws IllegalArgumentException {
		if (timeOfEvent == null) {
			throw new IllegalArgumentException(ErrorMessages.TIME_OF_EVENT_NULL);
		}
		return true;

	}

}
