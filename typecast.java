import java.util.*;
class typecast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        int age1=sc.nextInt();
        int age2=sc.nextInt();
        float w1=sc.nextFloat();
        float w2=sc.nextFloat();
        float average_w=(w1+w2)/2;
        System.out.println(name1+" "+"is"+" "+age1+" "+"years old!");
        System.out.println(name2+" "+"is"+" "+age2+" "+"years old!");
        System.out.printf("Average weight is : %.2f",average_w);


    }
    
}
