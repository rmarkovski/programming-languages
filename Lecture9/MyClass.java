public class MyClass {
    public String s;  // Making 's' public for direct access

    // Existing code from Assignment 1

    public void method1(String name) {
        // Your existing implementation for method1
        System.out.println("Method1 invoked with name: " + name);
    }

    public void method1(String name, Class<?> paramClass) {
        // Your extended implementation for method1 with parameter class
        System.out.println("Method1 invoked with name: " + name + " and parameter class: " + paramClass.getName());
    }

    // Adding a method to access and modify 's'
    public void setS(String newValue) {
        this.s = newValue;
    }

    public String getS() {
        return this.s;
    }

    public void method3() {
        // Your implementation for method3
        System.out.println("Method3 invoked. Value of 's': " + this.s);
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Access and print the value of the field 's'
        System.out.println("Value of the field 's': " + myObject.s);

        // Change the value of 's'
        myObject.setS("NewValue");
        System.out.println("Updated value of the field 's': " + myObject.getS());

        // Invoke method1 with only the parameter name
        myObject.method1("John");

        // Invoke method1 with both parameter name and parameter class
        myObject.method1("Jane", Integer.class);

        // Enable access to method3 and invoke it
        myObject.method3();
    }
}
