class Animals{
    void intro(){
    System.out.println("Hi, I'm an animal");
    }
}

class Cat extends Animals{

    void intro(){
        super.intro();
        System.out.println("I'm a Cat.");
        System.out.println("I Meow.");
    }
}


class Dog extends Animals{

    void intro(){
        super.intro();
        System.out.println("I'm a Dog.");
        System.out.println("I Bark.");
    }
}


public class MethodOverriding{
public static void main(String[] args) {
    Animals animal = new Animals();
    animal.intro();
    System.out.println("\n");

    Cat cat = new Cat();
    cat.intro();
    System.out.println("\n");


    Dog dog =new Dog();
    dog.intro();
    System.out.println("\n");



}
}