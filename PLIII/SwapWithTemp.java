import java.util.Scanner;

class SwapWithTemp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Two numbers :");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Original : A is :"+a+" B is "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("Swapped : A is :"+a+" B is "+b);
        sc.close();
    }
}