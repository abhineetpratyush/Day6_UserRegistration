package com.capgemini.userregistration;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
interface UserValidationInterface{
	boolean validate(String userInput);
}

public class UserRegistration {

	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	UserValidationInterface validateFirstName = firstName -> firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	UserValidationInterface validateLastName = lastName -> lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	UserValidationInterface validateEmailId = emailId -> emailId.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$");
	UserValidationInterface validateMobileNo = mobileNo -> mobileNo.matches("^[0-9]{2}[ ][0-9]{10}$");
	UserValidationInterface validatePassword = password -> password.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%_][0-9a-zA-Z]*");

	public boolean validateFirstName(String firstName) throws UserRegistrationException {
		
		if(validateFirstName.validate(firstName))
			return true;
		else
			throw new UserRegistrationException("Invalid First Name");
	}

	public boolean validateLastName(String lastName) throws UserRegistrationException {
		if(validateLastName.validate(lastName))
			return true;
		else 
			throw new UserRegistrationException("Invalid Last Name");
	}	

	public boolean validateEmail(String emailId) throws UserRegistrationException {
		if(validateEmailId.validate(emailId))
			return true;
		else
			throw new UserRegistrationException("Invalid Email Id");
	}

	public boolean validateMobileNo(String mobileNo) throws UserRegistrationException {
		if(validateMobileNo.validate(mobileNo))
			return true;
		else
			throw new UserRegistrationException("Invalid Mobile No");
	}

	public boolean validatePassword(String password) throws UserRegistrationException {
		if(validatePassword.validate(password))
			return true;
		else
			throw new UserRegistrationException("Invalid Password");
	}

	public static void main( String[] args ) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		LOG.info("First Name: ");
		String firstName = sc.nextLine();
		try {
			if(userRegistration.validateFirstName(firstName))
				LOG.info("Valid First Name");
		}
		catch(UserRegistrationException e) {
			e.printStackTrace();
		}

		LOG.info("Last Name: ");
		String lastName = sc.nextLine();
		try {
			if(userRegistration.validateLastName(lastName))
				LOG.info("Valid Last Name");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		LOG.info("Email ID: ");
		String emailId = sc.nextLine();
		try {
			if(userRegistration.validateEmail(emailId))
				LOG.info("Valid Email Id");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		LOG.info("Mobile No: ");
		String mobileNo = sc.nextLine();
		try {
			if(userRegistration.validateMobileNo(mobileNo))
				LOG.info("Valid Mobile No");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		LOG.info("Password: ");
		String password = sc.nextLine();
		try {
			if(userRegistration.validatePassword(password))
				LOG.info("Valid Password");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
}