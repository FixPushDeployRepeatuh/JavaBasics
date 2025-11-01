import model.Person;

public class Employee extends Person {
    Employee(String name) {
        super(name);
        System.out.println(super.name);
    }
}
