public class Main {
    public static void main(String[] args) {
        User user1 =  new User();

        user1.registerUser("Alex", "password");

        try {
            user1.registerUser("Ale x", "password");
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }

        try {
            user1.registerUser("Alex", "pass");
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
    }

}