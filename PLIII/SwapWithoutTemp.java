import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Original : A is :"+a+" B is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Original : A is :"+a+" B is "+b);
        in.close();
    }
}
