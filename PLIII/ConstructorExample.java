

public class ConstructorExample {
public static void main(String[] args) {
    Box b1=new Box();
    System.out.println("Volume of b1 = "+b1.volume());

    Box b2=new Box(5);
    System.out.println("Volume of b2 = "+b2.volume());


    Box b3=new Box(3,7,23);
    System.out.println("Volume of b1 = "+b3.volume());
}
}
