Key Components of the Code
Global Variables:

username, password, name: These are static variables that store the registered user's details. They are shared across the program and initialized as empty strings.
Scanner sc: This is used to read user input from the console.
Methods:

register():
This method facilitates user registration. It prompts the user to enter:
A username
A password
A name
These values are stored in the global variables. Once the registration is complete, a success message is displayed.
login():
This method allows the user to log in by entering their username and password. The input is validated against the stored credentials:
If the entered credentials match, a "Login successful" message is displayed.
Otherwise, it informs the user that the credentials are invalid.
logout():
This method simply displays a message indicating that the user has been logged out. However, it does not actually clear or reset any user data.
main():
This is the entry point of the program. It implements a looped menu system for user interaction. The user is prompted to choose an action:
1 for registration
2 for login
3 for logout
4 to exit the application
The program uses a switch statement to handle the user's choice.
User Interaction Loop:

The program continuously runs in a loop (while (true)), displaying the menu and handling the user's choices.
If the user chooses an invalid option, the program informs them and re-displays the menu.
The program exits gracefully when the user selects option 4.
How the Program Works
Register:

The user is prompted to set up their username, password, and name. These details are stored globally for later use.
A success message is displayed after successful registration.
Login:

The user is asked to input their username and password.
The program checks the input against the stored credentials:
If they match, the user is successfully logged in.
Otherwise, an error message is displayed, and the user is prompted to try again.
Logout:

Simply displays a message indicating the user has been logged out. No other functionality is tied to this action.
Exit:

Ends the program with a goodbye message using System.exit(0).
Strengths
Simple and Intuitive:
The program is easy to understand and use due to its clear menu system.
Basic Credential Validation:
Ensures users must register before logging in.
Infinite Loop:
Continuously allows the user to interact with the menu until they decide to exit.
Limitations
Single User Support:
The program only supports one user because the username, password, and name variables are static and shared globally. Multiple users cannot be registered or managed simultaneously.
No Password Security:
Passwords are stored in plain text and not encrypted, which is insecure.
Logout is Superficial:
The logout() method does not clear or reset the user session.
Error Handling:
The program assumes the user will input valid data. For example, entering a non-integer when prompted for a choice would cause the program to crash.
No Persistent Storage:
Registered user details are stored in memory and are lost once the program ends. There’s no database or file storage.
Possible Improvements
Add Support for Multiple Users:
Use a data structure like a HashMap to store multiple users' credentials (username as the key and password as the value).
Enhance Security:
Hash passwords using libraries like java.security.MessageDigest or java.util.Base64.
Persistent Storage:
Store user data in a file or database to allow data persistence between program executions.
Session Management:
Implement a proper user session and track the logged-in user.
Input Validation:
Add validation for user inputs to handle invalid entries gracefully.
Advanced Features:
Allow users to update their details.
Implement account recovery (e.g., password reset).
Provide more detailed error messages for failed logins
