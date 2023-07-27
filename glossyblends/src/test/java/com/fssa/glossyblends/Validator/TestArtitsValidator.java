package com.fssa.glossyblends.Validator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.fssa.glossyblends.model.Artist.ErrorMessages;

import static org.junit.Assert.*;

public class TestArtitsValidator {

//validTestcase for username
	@Test
	public void testValidationOfUserNameValid() {

		String name = "Madhu";

		Assertions.assertTrue(ArtitsValidator.validateUsername(name));

	}

	// InvalidTestcase for username

	@Test
	public void testValidationOfUserNameInValid() {

		String name = null;

		try {
			ArtitsValidator.validateUsername(name);
			Assertions.fail("The testcase failed for name validations");

		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals(ErrorMessages.INVALID_USERNAME_NULL, ex.getMessage());
		}
		
		
		
	}

	@Test

	// Valid testcases year of experience
	public void testValidateYearsOfExperienceValid() {
		int yearsOfExperience = 5;
		Assertions.assertTrue(ArtitsValidator.validateYearsOfExperience(yearsOfExperience));
	}

	// Invalid yearsOfExperience (less than or equal to 0) should throw an
	// IllegalArgumentException
//Invalid input testcases 
	@Test
	public void testValidateYearsOfExperienceInvalid() {
		int yearsOfExperience = -2;

		try {
			ArtitsValidator.validateYearsOfExperience(yearsOfExperience);
			Assertions.fail("expected exception was not thrown.");

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals(ErrorMessages.INVALID_YEARS_OF_EXPERIENCE_NEGATIVE, e.getMessage());
		}

	}
	
	
	
	
	
	
	
	//phone number testcase valid
	@Test
	public void testValidatePhoneNumberValid() {
		String PhoneNumber = "12345678";
		Assertions.assertTrue(ArtitsValidator.validatePhoneNumber(PhoneNumber));
	}
	@Test
	public void testValidatePhoneNumberInValid() {
		String PhoneNumber = "onetwothreefour";

		try {
			ArtitsValidator.validatePhoneNumber(PhoneNumber);
			Assertions.fail("expected exception was not thrown.");

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals(ErrorMessages.INVALID_PHONE_NUMBER_FORMAT, e.getMessage());
		}

	}
	
	
	//null Mobile number Testcase
	@Test
	
	public void testValidatePhoneNumberNull() {
		String PhoneNumber = null;

		try {
			ArtitsValidator.validatePhoneNumber(PhoneNumber);
			Assertions.fail("expected exception was not thrown.");

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals(ErrorMessages.INVALID_PHONE_NUMBER_NULL, e.getMessage());
		}

	}
	
@Test
	public void testValidatePhoneNumberEmpty() {
		String PhoneNumber = "       ";

		try {
			ArtitsValidator.validatePhoneNumber(PhoneNumber);
			Assertions.fail("expected exception was not thrown.");

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals(ErrorMessages.INVALID_PHONE_NUMBER_NULL, e.getMessage());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
