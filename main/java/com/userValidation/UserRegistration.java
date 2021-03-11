package com.userValidation;
import java.util.regex.Pattern;
public class UserRegistration {
        private static final String firstName1 = "^[A-Z]{1}[a-z]{2,}$";
        private static final String lastName = "^[A-Z]{1}[a-z]{2,}$";
        private static String message;

    public UserRegistration(String message) {
        UserRegistration.message = message;
    }
    public boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(firstName1);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(lastName);
        return pattern.matcher(lastName).matches();
    }
    public String analyseMood(String message) throws userValidatorException {
        try {
            if (message.contains("SAD"))
                throw new userValidatorException("please Enter Proper message");
            else
                return "HAPPY";
        } catch (userValidatorException e) {
            System.out.println(e);
        }
        return message;
    }

}
