import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxArray {
    public static void main(String[] args) {
        int length,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array :");
        length = sc.nextInt();
        int [] arr = new int[length];
        for (int i =0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" element:");
            arr[i] = sc.nextInt();
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Min and Max in "+ Arrays.toString(arr) +" are : "+max+" "+min);
        sc.close();
    }
}
