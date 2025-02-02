// Interface (Pure Abstraction)
interface Animal {
    void makeSound(); // Abstract method (must be implemented by subclasses)
}
// Another interface 
interface Herbivore {
}

// Implementing the Animal interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}
// Implementing multiple interfaces (Animal, Herbivore)
class Horse implements Animal, Herbivore {
    @Override
    public void makeSound() {
        System.out.println("Horse says: Neigh Neigh!");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Using interface reference (Polymorphism)
        Animal myCat = new Cat();
        Animal myHorse = new Horse();

        // Calling overridden methods
        myCat.makeSound();
        myHorse.makeSound();
    }
}
