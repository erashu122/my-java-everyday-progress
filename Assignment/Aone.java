import java.util.*;

public class Aone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
         int count =0;
        while (number>0){
            number =number/2;
            count++;
            
            if (count>=5){
                break;
            }
            if (number % 2 == 0) {
                continue;
            }
            System.out.println("odd number: " + number);
        }
        scanner.close();
    }
}