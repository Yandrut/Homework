package PasswordValidator;

public class Main {
    public static void main(String[] args) {
        StrongPassword password = new StrongPassword();
        try {
            if (!password.validate("qwerty")) {
                throw new WeakPasswordException();
            }
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
