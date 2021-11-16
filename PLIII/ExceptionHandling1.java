import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1{
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        try{
        x=sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("HI");
            e.printStackTrace();
            System.out.println("This was just a stacktrace");

        }
        finally{
            System.out.println("Handled Successfully \n Now rest of the Code...");
            sc.close();
        }

      
    }
}