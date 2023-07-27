package com.fssa.glossyblends.Validator;
import java.util.List;
//import com.fssa.glossyblends.Validator.ServiceValidations;
import com.fssa.glossyblends.model.Artist.Artist;
import com.fssa.glossyblends.model.Artist.ErrorMessages;
import com.fssa.glossyblends.model.Artist.Post;
import com.fssa.glossyblends.model.Artist.Services;


public class ArtitsValidator {
    public static boolean validateArtist(Artist artist) throws IllegalArgumentException {
        if (artist == null) {
            throw new IllegalArgumentException("Artist object is null");
        }
        else {
        validateArtistId(artist.getArtistId());
        validateUsername(artist.getUsername());
        validatePassword(artist.getPassword());
        validateEmail(artist.getEmail());
        validatePhoneNumber(artist.getPhoneNumber());
        validateYearsOfExperience(artist.getYearsOfExperience());
        validateIsAvailable(artist.isAvailable());
        validatePortfolio(artist.getPortfolio());
        validateSocialMediaLinks(artist.getSocialMediaLinks());
        validateLanguagesSpoken(artist.getLanguagesSpoken());
        validateLocation(artist.getLocation());
        validatePost(artist.getPostUrl());
        
        validateService(artist.getProvidingServices());
        }
        
		return true;
       
    }
    
    //validations for service list in artist class
    private static boolean validateService(List<Services> providingServices)throws IllegalArgumentException {
        for (Services service : providingServices) {
            ServiceValidations.validateService(service);
        }
        return true;
    }
   
    //Validations for list of posts
    
    private static boolean validatePost(List<Post> postWorks)throws IllegalArgumentException {
        for (Post post : postWorks) {
            PostValidations.ValidationOfPost(post);
        }
        return true;

    }
   
    
  

	// Validation for artistId
    public static boolean validateArtistId(String artistId) throws IllegalArgumentException {
        if (artistId == null || artistId.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_ARTIST_ID_NULL);
        }
        return true;

    }

    // Validation for userName
    public static boolean validateUsername(String username) throws IllegalArgumentException {
        if (username == null ) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_USERNAME_NULL);
        }
        return true;

    }

    // Validation for password
    public static boolean validatePassword(String password) throws IllegalArgumentException {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_PASSWORD_NULL);
        }
        return true;

    }

 
   
//validation for email
    public static boolean validateEmail(String email) throws IllegalArgumentException {
    	  if (email == null || email.trim().isEmpty()) {
              throw new IllegalArgumentException(ErrorMessages.INVALID_EMAIL_NULL);
          }
      

        EmailValidations.validateEmail(email);
        return true;
    }

    // Validation for phoneNumber
    public static boolean validatePhoneNumber(String phoneNumber) throws IllegalArgumentException {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_PHONE_NUMBER_NULL);
        }
        phoneNumberValidations.validateNumber(phoneNumber);
        return true;
    }

    
    //validation of year of experience
    
    public static boolean validateYearsOfExperience(int yearsOfExperience) throws IllegalArgumentException {
    	
    	
    
    	
        if (yearsOfExperience <= 0) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_YEARS_OF_EXPERIENCE_NEGATIVE);
        }
        return true;
        
    }

    public static boolean validateIsAvailable(boolean isAvailable) throws IllegalArgumentException {
        return true;
    }

    // Validation for portfolio
    public static boolean validatePortfolio(List<String> portfolio) throws IllegalArgumentException {
        if (portfolio == null || portfolio.isEmpty()) {
            throw new IllegalArgumentException("Portfolio cannot be empty or null");
        }
        return true;
    }

    // Validation for socialMediaLinks
    public static boolean validateSocialMediaLinks(List<String> socialMediaLinks) throws IllegalArgumentException {
        if (socialMediaLinks == null || socialMediaLinks.isEmpty()) {
            throw new IllegalArgumentException("Social media links cannot be empty or null");
        }
        
        ImageUrlValidations.validateImageUrl(null);
        return true;
    }

    // Validation for languagesSpoken
    public static boolean validateLanguagesSpoken(List<String> languagesSpoken) throws IllegalArgumentException {
        if (languagesSpoken == null || languagesSpoken.isEmpty()) {
            throw new IllegalArgumentException("Languages spoken cannot be empty or null");
        }
        return true;
    }

    //validate location
    public static boolean validateLocation(String location) throws IllegalArgumentException {
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty or null");
        }

        List<String> allowedLocations = LocationValidator.getAllowedLocations();
        if (!allowedLocations.contains(location)) {
            throw new IllegalArgumentException("Invalid location. Please choose from the list of allowed locations.");
        }
        return true;
    }

 
    

    
}
