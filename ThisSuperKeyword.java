class Animal {
    String name;
    // Constructor of Animal class
    Animal(String name) {
        this.name = name; // Using 'this' to differentiate instance variable and parameter
    }

    // Method to display name
    void display() {
        System.out.println("Animal: " + name);
    }
}
class Dog extends Animal {
    String breed;

    // Constructor of Dog class
    Dog(String name, String breed) {
        super(name); // Calling parent class constructor using 'super'
        this.breed = breed; // Using 'this' to differentiate instance variable and parameter
    }
    // Method to display details
    void showDetails() {
        super.display(); // Calling parent class method using 'super'
        System.out.println("Breed: " + this.breed);
    }
}

public class ThisSuperKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bruno", "Golden Retriever");
        // Calling method
        myDog.showDetails();
    }
}
