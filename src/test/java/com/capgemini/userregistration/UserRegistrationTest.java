package com.capgemini.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	//only tests for first name performed as RegEx for first and last names are same
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateFirstName("Abhineet");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateFirstName("Ab");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenFirstName_WhenNotStartCapital_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateFirstName("abc");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenFirstName_WhenContainOtherThanLetters_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateFirstName("Ab1pratyush");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenEmailId_WhenPoper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateEmail("abhineetpratyush1998@gmail.com");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenEmailId_WhenNotAtTheSymbol_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateEmail("abcgmail.com");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateMobileNo("91 1234567891");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenMobileNo_WhenNoSpace_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateMobileNo("911234567891");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenMobileNo_WhenNotExactTen_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateMobileNo("91 124585454454");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenMobileNo_WhenCountryCodeMoreThanTwo_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateMobileNo("912 1234567891");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validatePassword("abcA12@89");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenPassword_WhenMoreThanOneSpecialChar_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validatePassword("abcA12@@89");
    	Assert.assertFalse(result);
    }
}
