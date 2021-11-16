import java.lang.reflect.Array;

public class Example2 {
    public static void main(String[] args) {
        int number[]= {4,8,16,32,64,128,256,512};
        int sample[]= {2,0,4,4,0,8};

        for (int i=0;i<number.length;i++){
            try{
                System.out.println(number[i] +"/"+sample[i] +"= "+number[i]/sample[i]);
            }catch(ArithmeticException e){
                System.out.println("Can't divide by zero");
            }catch(ArrayIndexOutOfBoundsException k){
                System.out.println("No matching elements found.");
            }
        }
    }
}
