package day10.practice;

 class EmailValidatorr {
    public static boolean isValidEmail(String emailId) throws InvalidEmailException {
        if (emailId != null && emailId.contains("@")) {
            return true; 
        } else {
            throw new InvalidEmailException("Invalid email address: " + emailId);
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


public class Main {
    public static void main(String[] args) {
        String email1 = "john.doe@example.com";
        String email2 = "invalid_email";
        
        try {
            boolean isValidEmail1 = EmailValidatorr.isValidEmail(email1);
            System.out.println("Email1 is valid: " + isValidEmail1);
            
            boolean isValidEmail2 = EmailValidatorr.isValidEmail(email2);
            System.out.println("Email2 is valid: " + isValidEmail2);
        } catch (InvalidEmailException e) {
            System.err.println("Invalid Email: " + e.getMessage());
        }
    }
    

}
