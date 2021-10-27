package com.bl.junituserregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	private Pattern pattern; // Declaring The Pattern variable as private

	/*
	 * Declaring Validate First Name Method
	 */
	public boolean validateFirstName(String firstName) {
		// Here Declaring The Name Pattern
		String Name_Pattern = "^[A-Z][a-z]{2,}$"; // The First Letter With Cap And Min 3 Letters
		return Pattern.matches(Name_Pattern, firstName);// Matching The Name Pattern And FirstName And Returning It
	}

	public boolean validateLastName(String lastName) {
		// Here Declaring The Name Pattern
		String Name_pattern = "^[A-Z][a-z]{2,}$";// The First Letter With Cap And Min 3 Letters
		return pattern.matches(Name_pattern, lastName);// Matching The Name Pattern And FirstName And Returning It.
	}

	/*
	 * Declaring Valid Email Method using regex pattern for required email format
	 */
	public boolean validateEmail(String Email) {
		// Here Declaring The Email Pattern
		String Email_pattern = "[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z]{5}+.[a-zA-Z]{2,3}(.[a-zA-Z]{2})?$";
		return pattern.matches(Email_pattern, Email);// Matching The Email Pattern And Email And Returning It.
	}

	/*
	 * declaring ValidateNumber method
	 */
	public boolean validateNum(String PhoneNum) {
		// Here Declaring The Phone Number Pattern
		String Number_pattern = "^[9][1][ ][6-9]{1}[0-9]{9}$";
		return pattern.matches(Number_pattern, PhoneNum);// Matching The Phone Number Pattern And Phone Number And
															// Returning It
	}

	/*
	 * Declaring validatePassword method with min 8 digits and with one UpperCase
	 * ,Numeric values
	 */
	public boolean ValidatePassword(String Password) {
		// Here Declaring The Password Pattern
		String Password_pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}";
		return pattern.matches(Password_pattern, Password);
	}
}
