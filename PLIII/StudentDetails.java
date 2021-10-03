class Student {
    int roll;
    String name;
    
    void setRoll(int roll){
        this.roll = roll;
    }

    
    void setName(String name){
        this.name = name;
    }

    int getRoll(){
       return  this.roll ;
    }

    
   String getName(){
        return this.name ;
    }
  
}


public class StudentDetails{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Hariom");
        s1.setRoll(123);

        System.out.println("Name :"+s1.getName()+"  Roll :"+s1.getRoll());
    }
}