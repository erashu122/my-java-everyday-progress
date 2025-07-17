import java.util.*;
class typecast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enater name 1:");
        String name1=sc.nextLine();
        System.out.println("Enater name 2:");
        String name2=sc.nextLine();
        System.out.println("Enater age 1:");
        int age1=sc.nextInt();
        System.out.println("Enater age2:");
        int age2=sc.nextInt();
        System.out.println("Enater wight 1:");
        float w1=sc.nextFloat();
        System.out.println("Enater wight 2:");
        float w2=sc.nextFloat();
        float average_w=(w1+w2)/2;
        System.out.println(name1+" "+"is"+" "+age1+" "+"years old!");
        System.out.println(name2+" "+"is"+" "+age2+" "+"years old!");
        System.out.printf("Average weight is : %.2f",average_w);


    }
    
}
