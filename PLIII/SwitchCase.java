import java.util.Scanner;

public class SwitchCase {
 public static void main(String[] args) {
     int a = 9;
     int b=6;

     int ch =0;

     Scanner sc = new Scanner(System.in);
     System.out.println("Operations :\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division.\n Enter your choice : ");
     ch=sc.nextInt();
    switch(ch){
        case 1: System.out.println("Addition of "+ a +"+"+ b +" is "+(a+b));
                break;
        case 2: System.out.println("Subtraction  of "+ a +"-"+ b +" is "+(a-b));
                break;
        case 3: System.out.println("Multiplication of "+ a +"*"+ b +" is "+(a*b));
                break;
        case 4: System.out.println("Division  of "+ a +"/"+ b +" is "+(a/b));
    }

 }   
}
