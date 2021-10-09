interface Ishape{
    float getArea();
}


public class Circles implements Ishape{
     int radius;
    Circles(){}
    Circles(int radius){
        this.radius=radius;
    }
    @Override
    public float getArea() {
        return (float) 3.14 * radius * radius;
    }
    
    public static void main(String[] args) {
        Circles  cr = new Circles(5);
       System.out.println("Area is :"+ cr.getArea());
    }
}
