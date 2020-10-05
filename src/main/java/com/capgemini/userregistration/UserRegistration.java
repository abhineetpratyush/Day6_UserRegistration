package com.capgemini.userregistration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class UserRegistration {

	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);

	private boolean validateFirstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

	private boolean validateLastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}	
	
	private boolean validateEmail(String emailId) {
		return emailId.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$");
	}
	
	private boolean validateMobileNo(String mobileNo) {
		return mobileNo.matches("^[0-9]{2}[ ][0-9]{10}$");
	}
	
	private boolean validatePassword(String password) {
		return password.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%_][0-9a-zA-Z]*");
	}

	public static void main( String[] args ) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		LOG.info("First Name: ");
		String firstName = sc.nextLine();
		if(userRegistration.validateFirstName(firstName))
			LOG.info("Valid First Name");
		else
			LOG.info("Invalid First Name");
		
		LOG.info("Last Name: ");
		String lastName = sc.nextLine();
		if(userRegistration.validateLastName(lastName))
			LOG.info("Valid Last Name");
		else
			LOG.info("Invalid Last Name");
		
		LOG.info("Email ID: ");
		String emailId = sc.nextLine();
		if(userRegistration.validateEmail(emailId))
			LOG.info("Valid Email Id");
		else
			LOG.info("Invalid Email Id");
		
		LOG.info("Mobile No: ");
		String mobileNo = sc.nextLine();
		if(userRegistration.validateMobileNo(mobileNo))
			LOG.info("Valid Mobile No");
		else
			LOG.info("Invalid Mobile No");

		LOG.info("Password: ");
		String password = sc.nextLine();
		if(userRegistration.validatePassword(password))
			LOG.info("Valid Password");
		else
			LOG.info("Invalid Password");
	} 
}