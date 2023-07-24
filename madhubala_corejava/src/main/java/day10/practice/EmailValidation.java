package day10.practice;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// EmailValidator class to validate email addresses
class EmailValidator {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

class User {
    private String email;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailID() {
        return email;
    }
}

class UserManager {
    private ArrayList<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void registerUser(String email) throws InvalidEmailException {
        if (EmailValidator.isValidEmail(email)) {
            User newUser = new User(email);
            userList.add(newUser);
        } else {
            throw new InvalidEmailException("Invalid email address: " + email);
        }
    }
}

public class EmailValidation {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        try {
            userManager.registerUser("johndoe@example.com");
            userManager.registerUser("invalid_email");
        } catch (InvalidEmailException e) {
            System.err.println("Invalid Email: " + e.getMessage());
        }
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException() {
        super();
    }

    public InvalidEmailException(String message) {
        super(message);
    }

    public InvalidEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEmailException(Throwable cause) {
        super(cause);
    }
}
