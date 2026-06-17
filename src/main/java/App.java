public class App {
    public static void main(String[] args) {

        // Hardcoded secret (Security issue)
        String password = "admin123";

        // Null Pointer bug
        String s = null;
        System.out.println(s.length());

        // Division by zero bug
        int a = 10 / 0;
        System.out.println(a);

        // Duplicate code / unnecessary code smell
        String name = "Jenkins";
        String name2 = "Jenkins";

        // Unused variable (Code smell)
        int unused = 100;

        // Infinite loop (Bug)
        while(true) {
        }

        // Empty catch block (Code smell)
        try {
            int x = 5 / 0;
        } catch (Exception e) {
        }

        // String comparison bug
        String x = new String("hello");
        if (x == "hello") {
            System.out.println("Matched");
        }

        // Resource leak
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(sc.nextLine());

        // Array index out of bounds
        int[] arr = {1,2,3};
        System.out.println(arr[5]);

        // Dead code
        if (false) {
            System.out.println("Never executes");
        }
    }
}
