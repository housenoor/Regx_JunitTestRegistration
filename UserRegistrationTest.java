package com.bl.junituserregistration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * declaring the user registration class
 */
public class UserRegistrationTest {
    //Defining User Registration
    UserRegistration userRegistration = new UserRegistration();

    //Test To Valid FirstName Starts With Cap Letter And It Has Min 3 Letters
    @Test
    //Validation Of First Name And Return True
    public void givenFirstName_Return_True() {
        //Checking Validate FirstName With Pattern And Storing In result
        boolean result = userRegistration.validateFirstName("Srikanth");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertTrue(result);
    }

    //Test To Valid FirstName If It Starts With Small Letter Print False
    @Test
    public void givenFirstName_Return_False() {
        //Checking Validate FirstName With Pattern And Storing In result
        boolean result = userRegistration.validateFirstName("srikanth");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertFalse(result);
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_DoNotReturnMinThreeLetters_ReturnFalse() {
        boolean result = userRegistration.validateFirstName("Sr");
        Assertions.assertFalse(result);
    }

    //Test To Valid LastName Starts With Cap Letter And It Has Min 3 Letters
    @Test
    public void givenLastName_ShouldStartWith_UpperCase_Return_True() {
        //Checking Validate LastName With Pattern And Storing In result
        boolean result = userRegistration.validateFirstName("Housenoor");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_ShouldNotStart_withLowerCase_Return_False() {
        //Checking Validate LastName With Pattern And Storing In result
        boolean result = userRegistration.validateLastName("housenoor");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertFalse(result);
    }

    //Test To Valid Email Starts With Small Letter
    @Test
    public void givenEmail_ShouldStartsWith_SmallLetter_ReturnTrue() {
        //Checking Validate Email With Pattern And Storing In result
        boolean result = userRegistration.validateEmail("srikanthh994@gmail.com.in");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertTrue(result);
    }

    //Test To Valid Email Starts With Cap Letter
    @Test
    public void givenEmail_ShouldNotStartsWith_CapLetter_ReturnFalse() {
        //Checking Validate Email With Pattern And Storing In result
        boolean result = userRegistration.validateEmail("Srikanthh994@gmail.com");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertFalse(result);
    }

    //Test To Valid Email Ends With .Com
    @Test
    public void givenEmail_ShouldEndsWithCom_ReturnTrue() {
        //Checking Validate Email With Pattern And Storing In result
        boolean result = userRegistration.validateEmail("srikanthh994@gmail.com");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertTrue(result);
    }
    //Test To Phone Number Start With Country Code
    @Test
    public void givenPhoneNumber_ShouldStartWith_CountryCodeFollowedBy10digits_ReturnTrue() {
        //Checking Validate Phone Number With Pattern And Storing In result
        boolean result = userRegistration.validateNum("91 9381938400");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertTrue(result);
    }
    //Test To Phone Number Does Not Have 10Numbers Return False
    @Test
    public void givenPhoneNumber_DoesNotHave10Numbers_ReturnFalse() {
        //Checking Validate Phone Number With Pattern And Storing In result
        boolean result = userRegistration.validateNum("91 9381938");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertFalse(result);
    }
    //Test To Phone Number Does Have 10Numbers Return True
    @Test
    public void givenPhoneNumber_DoesNotHaveCountryCode_ReturnFalse() {
        //Checking Validate Phone Number With Pattern And Storing In result
        boolean result = userRegistration.validateNum("9666110767");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_ShouldMinOf8Digit_ReturnTrue() {
        boolean result = userRegistration.ValidatePassword("zlatan123");
        Assertions.assertTrue(result);
    }
    //Does Not Fulfill The Criteria

    @Test
    public void givenPassword_DoesNotContain_Min8Digits_ReturnFalse()  {
        boolean result = userRegistration.ValidatePassword("zlatan");
        Assertions.assertFalse(result);
    }
}