import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Lower limit :");
        int lower = sc.nextInt();
        System.out.print("Enter Upper Limit :");
        int upper = sc.nextInt();
        int sum =0;
        while(lower<=upper){
            if(lower<upper)
            System.out.print(lower+"+");
            else
            System.out.print(lower+"=");

            sum+=lower;
            lower++;
        }
        System.out.println(sum);
        sc.close();
    }
}
