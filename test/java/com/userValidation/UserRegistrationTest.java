package com.userValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstNameReturnTrue() throws userValidatorException {
        UserRegistration user = new UserRegistration("Happy");
        boolean result = user.validateFirstName("Seema");
        Assert.assertTrue(result);
        String mood = user.analyseMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test

    public void givenFirstNameIsFalse() {
        UserRegistration user = new UserRegistration("Sad");
        boolean result = user.validateFirstName("ss");
        Assert.assertTrue(result);
        String mood = null;
        try {
            mood = user.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }
}


