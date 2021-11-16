
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int key,size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array :");
        size = sc.nextInt();
        int [] arr = new int[size];
        for (int i =0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key:");
        key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("At:"+(int)(i+1));
                sc.close();
                return;
            }
        }
        System.out.println("Not Found!");
        sc.close();
    }

    }
