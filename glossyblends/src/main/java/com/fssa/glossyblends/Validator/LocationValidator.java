package com.fssa.glossyblends.Validator;

import java.util.Arrays;
import java.util.List;

public class LocationValidator {
    private static final List<String> allowedLocations = Arrays.asList("chennai", "tirunelveli", "coimbatore", "trichy");

    // Method to get the allowed locations
   
	public static List<String> getAllowedLocations() {
        return allowedLocations;
	}
}