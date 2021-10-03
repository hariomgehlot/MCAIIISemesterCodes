class Overload {
    String area(int side){
        return "Area of Square is "+side*side;
    }


    String area(float length,float width){
        return "Area ofRectange is  "+ length * width;
    }

    String area(float radius){
        return "Area of Square is "+Math.PI * Math.pow(radius, 2);
    }
}

public class OverloadMethod{
    public static void main(String[] args) {
        Overload ov = new Overload();

        System.out.println(ov.area(5));
        System.out.println(ov.area(5.7f,5.2f));
        System.out.println(ov.area(7.3f));
    }
}
