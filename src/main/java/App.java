import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Hardcoded password (Vulnerability)
        String password = "root123";

        // Unused variable (Code smell)
        int age = 25;

        // Null pointer risk (Bug)
        String name = null;
        if (name == null) {
            System.out.println(name.length());
        }

        // Duplicate string (Code smell)
        String city1 = "Bangalore";
        String city2 = "Bangalore";
        String city3 = "Bangalore";
        String city4 = "Bangalore";
        String city5 = "Bangalore";

        // Empty catch block (Code smell)
        try {
            int x = 10 / 0;
        } catch (Exception e) {
        }

        // Wrong string comparison (Bug)
        String s1 = new String("hello");
        if (s1 == "hello") {
            System.out.println("Equal");
        }

        // Resource leak (Code smell)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String input = sc.nextLine();
        System.out.println(input);

        // Dead code (Code smell)
        if (false) {
            System.out.println("This will never run");
        }

        // Magic number (Code smell)
        int salary = 50000;
        System.out.println(salary * 12);
    }
}
