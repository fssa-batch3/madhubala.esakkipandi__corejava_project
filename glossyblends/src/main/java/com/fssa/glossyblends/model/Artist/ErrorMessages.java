package com.fssa.glossyblends.model.Artist;

public interface ErrorMessages {

	public static final String INVALID_STUDENT_NULL = "Student can't be null";
	 public static final String INVALID_ARTIST_ID_NULL = "Artist ID can't be null";
	    public static final String INVALID_USERNAME_NULL = "Username can't be ";
	    public static final String INVALID_PASSWORD_NULL = "Password can't be null";
	    public static final String INVALID_EMAIL_NULL = "Email can't be null";
	    public static final String INVALID_PHONE_NUMBER_NULL = "Phone number can't be NULL";
	    public static final String INVALID_YEARS_OF_EXPERIENCE_NEGATIVE = "Years of experience can't be negative";
	    public static final String INVALID_LOCATION_NULL = "Location can't be empty";
	    public static final String INVALID_AVERAGE_RATING_NEGATIVE = "Average rating can't be negative";
	    public static final String INVALID_SERVICE_OBJECT_NULL = "Service object can't be null";
	    public static final String INVALID_SERVICE_NAME_NULL = "Service name can't be null";
	    public static final String INVALID_SERVICE_PRICE_NULL = "Service price can't be null";
	    public static final String INVALID_SERVICE_URL_NULL = "Service url can't be null";
	    public static final String INVALID_PHONE_NUMBER_FORMAT = "Phone number not matches the correct format";
	    public static final String INVALID_SERVICE_NAME_PATTERN = "Service name not matches the appropriate text format";
	    public static final String INVALID_SERVICE_IMAGE_URL_FORMAT_PATTERN = "Service url not matches the appropriate url format";
	    public static final String INVALID_EMAIL_FORMAT = "Email not matches the correct fomat";
	    public static final String DESCRIPTION_LENGTH_FORMAT = "Description lenght should be greater than 15 ";
// fail message
	    
	    public static final String INVALI_SERIVICE_FAIL_MSG = " Servic name invalid failed";
	    public static final String INVALI_EVENT_NAME_NULL = " event name null invalid failed";

	    public static final String DATE_EVENT_NAME_NULL = " date of the event name null invalid failed";
	    public static final String DATE_EVENT_PASSED = " date of the event is already is passed invalid failed";
	    public static final String TIME_OF_EVENT_NULL = " time of the event is already is null invalid failed";

}
