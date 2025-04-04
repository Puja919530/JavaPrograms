package ex_10_oops_polymorphism;

class Animal{
    public void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{

    public void sound(){
        System.out.println("Bark");
    }
}

public class Lab_018_MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

        Animal a = new Animal();
        a.sound();
    }
}
