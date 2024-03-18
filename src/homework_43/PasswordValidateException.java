package homework_43;
/*
@date 18.03.2024
@author Sergey Bugaienko
*/

public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password Validate Exception: " +  super.getMessage();
    }
}
