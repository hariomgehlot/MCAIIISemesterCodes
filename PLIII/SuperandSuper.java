

class GrandFather{
    int age;
    GrandFather(){
        System.out.println("GrandFather Created!");
    }
    GrandFather(int age){
        this.age=age;
        System.out.println("GrandFather has created with age :"+age);
    }
}

class Father extends GrandFather{
    Father(){
        //here default the super() is called automatically if we want to call GrandFather(45) we 
        // pass super(45);
        super(45);
        System.out.println("Father is Created.");
    }
}

class Son extends Father{
Son(){
    System.out.println("Son is Created.");
}
}


public class SuperandSuper {
    public static void main(String[] args) {
        Son son = new Son();

    }
}

