import java.util.Scanner;

public class StringFunctionEx {
    public static void main (String[] args){
        String greeting = greet(); // Call the greet method to get the greeting message
        // Print the greeting message
        System.out.println(greeting); //    Output the greeting message

    }
    static String greet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of student :");
        String name = sc.nextLine();
        return "Hello " + name + ", welcome to the class!";
    }
}