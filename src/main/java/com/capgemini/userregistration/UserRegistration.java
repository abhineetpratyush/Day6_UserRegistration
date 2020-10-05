package com.capgemini.userregistration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class UserRegistration {
	
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
 	
	private boolean validateFirstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
    	LOG.info("First Name: ");
    	String firstName = sc.nextLine();
    	UserRegistration userRegistration = new UserRegistration();
    	if(userRegistration.validateFirstName(firstName))
    		LOG.info("Valid First Name");
    	else
    		LOG.info("Invalid First Name");
    } 
}