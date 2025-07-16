public class Swap {
    public static void main(String[] args) {
        Swap swapper = new Swap(); // Create an instance of Swap
        int num1 = 12;
        int num2 = 34;
        swapper.swap(num1, num2); // Call the swap method with two integers
        swapper.add(num1, num2); // Call the add method with two integers

    }
    public void swap (int val1,int val2) {
        System.out.println("Before swapping: val1 = " + val1 + ", val2 = " + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println("After swapping: val1 = " + val1 + ", val2 = " + val2);
    }
    public void add(int val1, int val2) {
        System.out.println("Sum: " + (val1 + val2));
    }
}
