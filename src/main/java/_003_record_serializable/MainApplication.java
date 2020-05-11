package _003_record_serializable;

import java.io.*;

record Person(String name, int age) implements Serializable {
    public Person {
        System.out.println("record Person");
    }
}

public class MainApplication {
    public static void main(String[] args) {
        var person = new Person("Katerina", 35);
        writeToFile(person, "myFile.txt");
        System.out.println(readFromFile("myFile.txt"));

    }

    static void writeToFile(Person obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(obj);
            System.out.println("writeToFile\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Person readFromFile(String path) {
        Person result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            result = (Person) ois.readObject();
            System.out.println("readFromFile\n");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
