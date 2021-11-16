public class WrapperClasses {
    public static void main(String[] args) {
        String values = "20";
        int a = Integer.valueOf(values);

        System.out.println("Value of  a is : "+a);

        a =2346;
        values  = String.valueOf(a);
        System.out.println("Value of  values  is : "+values+" Type of values is : "+values.getClass());
    }
}
