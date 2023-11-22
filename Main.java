public class Main {
    public static void main(String[] args) {
        // Create an instance of Test
        Test testObject = new Test();

        // Invoke method1 to print the value of s
        testObject.method1();

        // Invoke method2 to print the value of a specific integer (e.g., 42)
        testObject.method2(42);

        // Private method3 cannot be directly invoked outside the Test class
        // It can only be called from within other methods of the Test class
    }
}
