public class Main {
    public static void main(String[] args) {
        Test testObject = new Test();
        
        System.out.println("Class Name: " + testObject.getClass().getName());

        System.out.println("Constructor Name: " + testObject.getClass().getName());

        System.out.println("Method Names:");
        java.lang.reflect.Method[] methods = Test.class.getDeclaredMethods();
        for (java.lang.reflect.Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
