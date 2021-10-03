class parent1{
    String s1="Parent class member";
    int i1=1;
    void f1(){
        System.out.println("Method of Parent class");
    }
}

public class SingleLevelinheritance extends parent1 {
    String s2="Child class member";
    public static void main(String args[]){
SingleLevelinheritance obj=new SingleLevelinheritance();
        System.out.println(obj.s1);
        System.out.println(obj.i1);
        System.out.println(obj.s2);
        obj.f1();
    }
}


