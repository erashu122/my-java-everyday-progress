
import java.util.Scanner;


// import java.util.Scanner;

// public class input{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name = sc.nextLine();
//         System.out.println("Enter your age:");
//         int age = sc.nextInt();
//         System.out.println("Hello " + name + ", you are " + age + " years old.");
//         sc.close(); 

//     }
    
// }
public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        int answer = number++ + ++number - --number -number++;
        System.out.println("The answer is: " + answer);
        // The output will be 0
        /* Explanation:
         * 1. number++ uses the current value (1) and then increments it.
         * 2. ++number increments the value (2) and then uses it.
         * 3. --number decrements the value (1) and then uses it.
         * 4. -number++ uses the current value (1) and then increments it.
         * So the expression evaluates to 1 + 2 - 1 - 1 = 0
         * * Note: The output may vary based on the initial value of 'number'.
         * * Example:
         * * If you enter 5, the output will be 6.
         * * If you enter 10, the output will be 11.
         * * If you enter 0, the output will be 0.
         * * The output will always be 0 if the initial value of 'number' is 1.
        */
        sc.close(); 
    }
}