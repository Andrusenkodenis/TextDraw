public class Main {
    public void main() {
        hello();
        tree();
    }

    public static void hello() {
        System.out.println("Hello, World\nThis is Java!");
    }

    public static void tree() {
        System.out.println("""
                 *
                ***
                ****
               ******
                  |
               """);
    }
}
