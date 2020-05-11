package _001_record_default_constructor;

public class MainApplication {

    public record Person(String name, Integer age) {
        public Person(String name, Integer age) {
            if (name != null && age > 0) {
                this.name = name;
                this.age = age;
            } else {
                throw new IllegalArgumentException("Invalid values");
            }
        }
    }

    public static void main(String[] args) {
        var person1 = new Person("Katerina", 35);
        var person2 = new Person("Lena", 44);

        System.out.println("Object\t\t: " + person1);
        System.out.println("Equals\t\t: " + person1.equals(person2));
        System.out.println("Name\t\t: " + person1.name());
        System.out.println("Age\t\t\t: " + person1.age());
        System.out.println("HashCode\t: " + person1.hashCode());

        System.out.println("--------------------------------------");

        System.out.println("Object\t\t: " + person2);
        System.out.println("Equals\t\t: " + person2.equals(person1));
        System.out.println("Name\t\t: " + person2.name());
        System.out.println("Age\t\t\t: " + person2.age());
        System.out.println("HashCode\t: " + person2.hashCode());
    }
}
