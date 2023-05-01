package PasswordValidator;

public class StrongPassword implements PasswordValidator {
    @Override
    public boolean validate(String password) {
       return (password.length() >= 8);
    }
}
