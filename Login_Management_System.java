import java.util.*;

public class Main {
    static class Account {
        String username;
        String password;
        String name;

        Account(String username) {
            this.username = username;
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static LinkedList<Account> accounts = new LinkedList<>();
    static String currentUser = "";

    public static void register() {
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        System.out.println("Enter name: ");
        String name = sc.next();

        // Create new account and add to list
        Account newAccount = new Account(username);
        newAccount.password = password;
        newAccount.name = name;
        accounts.add(newAccount);

        System.out.println("Registration successful!");
    }

    public static void login() {
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();

        boolean loginSuccessful = false;
        for (Account account : accounts) {
            if (account.username.equals(username) && account.password.equals(password)) {
                currentUser = username;
                loginSuccessful = true;
                System.out.println("Login successful!");
                break;
            }
        }

        if (!loginSuccessful) {
            System.out.println("Invalid username or password.");
        }
    }

    static void logout() {
        if (!currentUser.isEmpty()) {
            currentUser = "";
            System.out.println("You have been logged out.");
        } else {
            System.out.println("No user is currently logged in.");
        }
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
