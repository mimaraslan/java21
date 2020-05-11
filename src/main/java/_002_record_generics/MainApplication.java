package _002_record_generics;

class Department {
    public Department() {
        System.out.println("class Department");
    }
}

record Person<T>(T info, String name, Integer age, double length, double weight) {
    public Person {
        System.out.println("record Person");
    }
}

public class MainApplication {
    public static void main(String[] args) {
        Person<Department> person = new Person<>(new Department(), "Katerina", 35, 1.72, 65);
        System.out.println(person);
    }
}
