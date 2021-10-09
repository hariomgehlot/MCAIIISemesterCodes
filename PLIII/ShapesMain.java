import java.util.Scanner;

class Shapes {
    float width,height;
   
}

class Rectangle extends Shapes{
    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width of the Rectangle  :");
        width=sc.nextFloat();

        System.out.println("Enter height of the Rectangle :");
        height=sc.nextFloat();

    }
  
    void area(){
      inputData();
      System.out.println("The Area of Rectangle is  : "+width*height);
    }

}

class Triangle extends Shapes{
    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width of the Triangle:");
        width=sc.nextFloat();

        System.out.println("Enter height of the Triangle :");
        height=sc.nextFloat();
      
    }
  
    void area(){
      inputData();
      System.out.println("The Area of Triangle is  : "+width * height * 0.5);
    }

}


public class ShapesMain{
    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        Triangle tri= new Triangle();
        rct.area();
        tri.area();
    }
}