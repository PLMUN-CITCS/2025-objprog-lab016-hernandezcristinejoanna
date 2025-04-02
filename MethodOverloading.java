public class MethodOverloading {
    public static void main(String[] args) {
        // Call the overloaded printValue methods
        printValue(10);
        printValue(3.14);
        printValue("Hello!");
    }

    // First method: accepts an int
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second method: accepts a double
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third method: accepts a String
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
