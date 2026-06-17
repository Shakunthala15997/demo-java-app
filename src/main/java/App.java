public class App {
    public static void main(String[] args) {

        // Hardcoded secret
        String password = "admin123";

        // Possible null pointer
        String s = null;
        if (s != null) {
            System.out.println(s.length());
        }

        // Unused variable
        int unused = 100;

        // Duplicate values
        String name = "Jenkins";
        String name2 = "Jenkins";

        // Empty catch block
        try {
            int x = 5 / 0;
        } catch (Exception e) {
        }

        // Wrong string comparison
        String x = new String("hello");
        if (x == "hello") {
            System.out.println("Matched");
        }

        // Resource leak
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Dead code
        if (false) {
            System.out.println("Never executes");
        }
    }
}
