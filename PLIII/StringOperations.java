public class StringOperations {
    public static void main(String[] args) {
        String one = "String 1 ";
        String two = "String 2";

         String three = one.concat(two); //concatenating by function 
        System.out.println("Three = "+three);

        one=one+two;                    //concatenating by '+' operator

        System.out.println("One = "+one);

        //copyting one to another

        System.out.println("Before copying Two = "+two);
        two=three;
        System.out.println("After  copying Two = "+two);


        //alternate methods

        two= new String(one);

        //alternate
        two = String.valueOf(three);



    }
}
