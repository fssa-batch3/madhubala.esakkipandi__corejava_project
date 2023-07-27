package com.fssa.glossyblends.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fssa.glossyblends.model.Artist.ErrorMessages;

public class ArtistNameValidations {

	
	public static boolean validateName(String name)throws  IllegalArgumentException{
		
		
        String emailValidationPattern = "^[A-Za-z]$";

        Pattern pattern=Pattern.compile(emailValidationPattern);
        
        Matcher emialValidation=pattern.matcher(name);
    	boolean isValid=emialValidation.matches();

        if(!isValid) {
        	
        	throw new IllegalArgumentException(ErrorMessages.INVALID_SERVICE_NAME_PATTERN);
        	
        }
        return true;
        
	}
	
}
