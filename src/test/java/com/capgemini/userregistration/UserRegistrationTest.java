package com.capgemini.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	//only tests for first name performed as RegEx for first and last names are same
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
    	try {
			result = userValidator.validateFirstName("Abhineet");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
			userValidator.validateFirstName("Ab");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void givenFirstName_WhenNotStartCapital_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
			userValidator.validateFirstName("abc");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void givenFirstName_WhenContainOtherThanLetters_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
			userValidator.validateFirstName("Ab1pratyush");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void givenEmailId_WhenPoper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
		try {
			result = userValidator.validateEmail("abhineetpratyush1998@gmail.com");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenEmailId_WhenNotAtTheSymbol_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
			userValidator.validateEmail("abcgmail.com");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
		try {
			result = userValidator.validateMobileNo("91 1234567891");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenMobileNo_WhenNoSpace_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
			userValidator.validateMobileNo("911234567891");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void givenMobileNo_WhenNotExactTen_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
			userValidator.validateMobileNo("91 124585454454");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void givenMobileNo_WhenCountryCodeMoreThanTwo_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
			userValidator.validateMobileNo("912 1234567891");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
		try {
			result = userValidator.validatePassword("abcA12@89");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenPassword_WhenMoreThanOneSpecialChar_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
		try {
		userValidator.validatePassword("abcA12@@89");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
    }
}
