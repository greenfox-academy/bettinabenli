import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        System.out.println("Please type in your name!");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Hello, " + userName + "!");
    }
}