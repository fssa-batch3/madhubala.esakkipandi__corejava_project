package com.fssa.glossyblends.Validator;


import java.util.regex.Pattern;

import com.fssa.glossyblends.model.Artist.ErrorMessages;

import java.util.regex.Matcher;

public class ImageUrlValidations {
	
    public static boolean validateImageUrl(String imageUrl) throws IllegalArgumentException {
        String imagePattern = "\\b(?:https?|ftp)://\\S+\\.(?:jpg|jpeg|png|gif|bmp)\\b";
        Pattern pattern = Pattern.compile(imagePattern);
        Matcher urlMatcher = pattern.matcher(imageUrl);
        boolean isValid = urlMatcher.matches();
        if (!isValid) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_SERVICE_IMAGE_URL_FORMAT_PATTERN);
        }
        return true;
    }

	
}