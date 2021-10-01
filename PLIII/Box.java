
 class Box{
    double width,height,length=0.0;

    Box(){

    }
    Box(double all){
        width=height=length=all;
    }
    Box(double height,double width,double length){
        this.height =height;
        this.width =width;
        this.length=length;
    }


    double volume(){
        return height *length*width;
    }

}

