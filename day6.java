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
