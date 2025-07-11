import java.util.*;
public class par2{
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first :");
        String firstm1=scanner.nextLine();
        System.out.println("Enter second :");
        String secondm2=scanner.nextLine();

        String combind=firstm1.concat(secondm2);

        System.out.println(combind);


    }
}