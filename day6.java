class day6 {
    public static void main(String[] args) {
    
        int a=12;
        int b=10;
        int c=5;
        int sum=a+b+c;
        System.out.println("The sum is: " + sum);
        // Call the second class to execute its main method
        // This is a simple Java program that calculates the sum of three integers
        day6_1.main(args); // Call the second class to execute its main method
    }
}
// Output: The sum is: 27
class day6_1{
    public static void main(String[] args) {
        float a=12.5f;
        float b=10.5f;
        float c=5.5f;
        float sum=a+b+c;
        System.out.println("The sum is: " + sum);
    }
}
// Output: The sum is: 28.5
// This is a simple Java program that calculates the sum of three floating-point numbers
// The first class calculates the sum of three integers and calls the second class to calculate the sum of three floating-point numbers
// The second class is executed after the first class, demonstrating how to call another class's main method in Java
// The output of the first class is "The sum is: 27" and the output of the second class is "The sum is: 28.5"
// This program demonstrates how to use multiple classes in Java and how to call methods from one class to another
// It also shows how to handle different data types (integers and floating-point numbers) in Java
// The program is structured to be simple and easy to understand, making it suitable for beginners learning Java programming
// The use of comments helps explain the purpose of each part of the code, making it easier to follow along
// Overall, this program serves as a basic example of Java programming concepts such as class structure, method calling, and data types in Java
// It can be used as a starting point for more complex Java programs that involve calculations and method interactions between classes
// The program can be compiled and run in any Java development environment, such as Eclipse, IntelliJ IDEA, or even a simple text editor with Java installed
// The output can be observed in the console, showing the results of the calculations performed in both classes
// This program can be extended further by adding more classes, methods, or functionalities as needed   