import java.util.Scanner;

public class LoginSystem {
    static Scanner sc = new Scanner(System.in);
    static String username = "";
    static String password = "";
    static String name = "";

    static void register() {
        System.out.println("Enter username:");
        username = sc.nextLine();
        System.out.println("Enter password:");
        password = sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Registration successful!");
    }

    static void login() {
        System.out.println("Enter username:");
        String user = sc.nextLine();
        System.out.println("Enter password:");
        String pass = sc.nextLine();
        
        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    static void logout() {
        System.out.println("You have been logged out.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Logout");
            System.out.println("4. Exit");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    logout();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
