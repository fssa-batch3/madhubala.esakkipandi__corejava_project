package day10.practice;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class UserManagerTest {

    @Test
    public void testValidEmailRegistration() {
        UserManager userManager = new UserManager();

        try {
            userManager.registerUser("johndoe@example.com");
            List<User> userList = userManager.getUserList();
            assertEquals(1, userList.size());
            assertEquals("johndoe@example.com", userList.get(0).getEmail());
        } catch (InvalidEmailException e) {
            fail("Unexpected InvalidEmailException: " + e.getMessage());
        }
    }

    @Test
    public void testInvalidEmailRegistration() {
        UserManager userManager = new UserManager();

        try {
            userManager.registerUser("invalid_email");
            fail("Expected InvalidEmailException, but no exception was thrown.");
        } catch (InvalidEmailException e) {
            assertEquals("Invalid email address: invalid_email", e.getMessage());
        }
    }

    @Test(expected = InvalidEmailException.class)
    public void testInvalidEmailWithMultipleDotsRegistration() throws InvalidEmailException {
        UserManager userManager = new UserManager();
        userManager.registerUser("john..doe@example.com");
    }

    @Test(expected = InvalidEmailException.class)
    public void testNullEmailRegistration() throws InvalidEmailException {
        UserManager userManager = new UserManager();
        userManager.registerUser(null);
    }

    @Test(expected = InvalidEmailException.class)
    public void testEmptyEmailRegistration() throws InvalidEmailException {
        UserManager userManager = new UserManager();
        userManager.registerUser("");
    }
}
