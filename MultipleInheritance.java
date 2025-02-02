// First interface
interface Animal {
    void walk(); // Abstract method (must be implemented)
}
// Second interface
interface Herbivore {
}

// Class implementing both interfaces (Multiple Inheritance)
class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Horse walks on the grass");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}
   
