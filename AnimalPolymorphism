class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Sound of the animal is: ");
    }
    // Common method
    void eat() {
        System.out.println("Animal is eating.");
    }
}
class Horse extends Animal {
    @Override
    void makeSound() {
        System.out.println("Horse neighs: Neigh Neigh!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class AnimalPolymorphism {
    public static void main(String[] args) {
        // Parent class reference pointing to child class objects (Polymorphism)
        Animal myHorse = new Horse();
        Animal myCat = new Cat(); 

        // Calls overridden methods
        myHorse.makeSound();
        myCat.makeSound();

        // Calling common method
        myHorse.eat();
        myCat.eat();
    }
}
