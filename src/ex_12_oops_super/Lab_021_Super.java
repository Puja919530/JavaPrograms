package ex_12_oops_super;

class God {
    void sound(){
        System.out.println("God!");
    }
}

class Animal extends God {
    protected String color  = "white";
    void sound(){
        System.out.println("Animal sound");
        super.sound();
    }
}

class Dog extends Animal{
     private String color = "black";

    @Override
    void sound() {
      //  System.out.println("Dog is barking...");
        System.out.println(this.color);
        System.out.println(super.color);
        //super.sound(); //call animal method and God method alsos
    }
}
public class Lab_021_Super {
    public static void main(String[] args) {

        God  g = new God();
        //g.sound();
        Animal a =  new Animal();
        //a.sound();
        Dog d = new Dog();
        d.sound();
    }
}
