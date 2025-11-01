import AbstractTrainee.Car;
import AbstractTrainee.Vehicle;
import finalTrainee.Boss;
import finalTrainee.Member;
import staticTrainee.Student;

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
//        Dog d = new Dog();
//        System.out.println(d);

//        Employee e = new Employee("David");

        //Abstract Class and Abstract method
//        Car vehicle = new Car();
//        vehicle.speed();

        // Static process
//        Student.TeacherName = "panda";
//        System.out.println(Student.TeacherName);
//        Student.main(args);

        //final
        Member b = new Member();
        b.disp();

    }
}