public class Main {
    public static void main(String[] args) {
        // Create an instance of the Test class
        Test testObject = new Test();

        // Print the class name
        System.out.println("Class Name: " + testObject.getClass().getName());

        // Print the constructor name
        System.out.println("Constructor Name: " + testObject.getClass().getName());

        // Print all method names
        System.out.println("Method Names:");
        java.lang.reflect.Method[] methods = Test.class.getDeclaredMethods();
        for (java.lang.reflect.Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
