class Person {
    String name;
    int age;

    // Default Constructor (No parameters)
    Person() {
        System.out.println("Call Default Constructor ");
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Person(String name, int age) {
        System.out.println("Call Parameterized Constructor ");
        this.name = name;
        this.age = age;
    }

    // Copy Constructor (Manual Implementation)
    Person(Person p) {
        System.out.println("Call Copy Constructor ");
        this.name = p.name;
        this.age = p.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
public class TypesOfConstructor {
    public static void main(String[] args) {
        // Default Constructor
        Person p1 = new Person();
        p1.display();

        // Parameterized Constructor
        Person p2 = new Person("Hari", 25);
        p2.display();

        // Copy Constructor
        Person p3 = new Person(p2);
        p3.display();
    }
}
