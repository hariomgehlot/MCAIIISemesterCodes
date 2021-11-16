public class Example{
    public static void main(String[] args) {
        int n[] =new int[5];
        try{
            
            System.out.println(n[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBounds occurred");
        }
        try{
            n[2]=5/0;

        } catch(ArithmeticException e){
                System.out.println("ArithmeticException occurred");
        }

        System.out.println("Rest of the  code");

    }
}