//package day10.practice;
//
//
//import java.util.ArrayList;
//
//class Userr {
//    private String emailID;
//
//    public Userr(String emailID) {
//        this.emailID = emailID;
//    }
//
//    public String getEmailID() {
//        return emailID;
//    }
//
//}
//
//class UserAlreadyExistsException extends Exception {
//    public UserAlreadyExistsException(String message) {
//        super(message);
//    }
//}
//
//class UserManager {
//    private ArrayList<User> userList;
//
//    public UserManager() {
//        userList = new ArrayList<>();
//    }
//
//    public void register(Userr user) throws UserAlreadyExistsException {
//        for (Userr existingUser : userList) {
//            if (existingUser.getEmailID().equals(user.getEmailID())) {
//                throw new UserAlreadyExistsException("User with the provided emailID already exists.");
//            }
//        }
//
//        userList.add(user);
//    }
//}
//
//public class Main2 {
//    public static void main(String[] args) {
//        UserManager userManager = new UserManager();
//
//        try {
//            Userr user1 = new Userr("user1@example.com");
//            userManager.register(user1);
//
//            Userr user2 = new Userr("user1@example.com");
//            userManager.register(user2);
//        } catch (UserAlreadyExistsException e) {
//            System.err.println("User registration failed: " + e.getMessage());
//        }
//    }
//}
