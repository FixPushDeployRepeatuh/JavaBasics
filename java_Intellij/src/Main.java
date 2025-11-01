

class Animal{
    int age= 10;

    Animal(String name){
        System.out.println(name);
    }

    void makeSound(){
        System.out.println("I am a Sound");
    }
}

class Dog extends Animal{
    Dog(){
        super("Monkey");
        super.makeSound();
        System.out.println(super.age);
        System.out.println("Dog");
    }
}


public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d);

    }
}