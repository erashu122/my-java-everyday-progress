import java.util.Scanner;

class Gratting {
    public static void main(String[] args) {
        int ans=sum2();
        System.out.println(ans);

    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number ");
        int num1 = in.nextInt();
        System.out.print("Enter the number2 ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
