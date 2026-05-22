package lab.lab03;

public class Person {
    String name, address;
    int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Address:"+address);
        System.out.println("Age: "+age);
    }
}
