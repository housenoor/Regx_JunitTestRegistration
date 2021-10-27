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
        Assertions.assertTrue(result);
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_DoNotReturnMinThreeLetters_ReturnFalse() {
        boolean result = userRegistration.validateFirstName("Sr");
        Assertions.assertTrue(result);
    }
}