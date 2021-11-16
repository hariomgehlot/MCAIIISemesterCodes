

class Employee {
    int salary;
    String name;
    
    void setsalary(int salary){
        this.salary = salary;
    }

    
    void setName(String name){
        this.name = name;
    }

    int getsalary(){
       return  this.salary ;
    }

    
   String getName(){
        return this.name ;
    }
  
}


public class EmployeeDetails{
    public static void main(String[] args) {
        Employee s1 = new Employee();
        s1.setName("Hariom");
        s1.setsalary(123);

        System.out.println("Name :"+s1.getName()+"  salary :"+s1.getsalary());
    }
}