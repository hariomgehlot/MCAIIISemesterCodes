 class Figure{
    int dim1,dim2;
   
    Figure(){
    }
    Figure(int dim1,int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
     
    float area(){
        return 0.0f;
    }
}

class Rectangles extends Figure{
    Rectangles(){}
    Rectangles(int dim1,int dim2){
        super(dim1,dim2);
    }

    @Override
    float area() {
       
        return dim1 *dim2;
    }
}


class Triangles extends Figure{
    Triangles(){

    }
    Triangles(int dim1,int dim2){
        super(dim1, dim2);
    }

    @Override
    float area() {
        return  (float)0.5* dim1*dim2;
    }
}


public class FigureMain {
    public static void main(String[] args) {
        
       Rectangles rcts = new Rectangles(6, 4);  
       System.out.println("The Area of Rectangle of dims (6,4) is : "+rcts.area());     // calling Rectangles area method


      Triangles trias= new Triangles(6, 4);  
      System.out.println("The Area of Triangle of dims (6,4) is : "+trias.area());     // calling Triangles area method

    }
}
