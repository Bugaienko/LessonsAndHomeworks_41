package homework_43;
/*
@date 18.03.2024
@author Sergey Bugaienko
*/

public class PasswordValidator {

    public static void passwordValidate(String password) throws PasswordValidateException {

        if (password == null || password.length() < 8) throw new PasswordValidateException("wrong length");

        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpecialSymbol = false;

        // альтернативный вариант запоминания
        boolean[] res = new boolean[4]; // false, false, false, false

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                isDigit = true;
//                res[0] = true;
                continue;
            }

            if (Character.isLowerCase(c)) {
                isLowerCase = true;
//                res[1] = true;
                continue;
            }

            if (Character.isUpperCase(c)) {
                isUpperCase = true;
                continue;
            }

            if ("!%$@&*()[]".indexOf(c) >= 0) {
                isSpecialSymbol = true;
                continue;
            }
        }


        if (!isLowerCase) throw new PasswordValidateException("no lowerCase symbol in password");
        if (!isUpperCase) throw new PasswordValidateException("no upperCase symbol in password");
        if (!isDigit) throw new PasswordValidateException("no digit in password");
        if (!isSpecialSymbol) throw new PasswordValidateException("no special symbol in password");
    }
}
