// Method Overloading 
class Calculate {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }
    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Parent class for Method Overriding 
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}
// Child class overriding the makeSound() method
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat sayas: Meow Meow!");
    }
}

public class OverloadingOverriding {
    public static void main(String[] args) {
        // Method Overloading Demonstration
        Calculate calc = new Calculate();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));

        // Method Overriding Demonstration
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls Animal's method
        Animal myCat = new Cat(); // Using parent reference for child object
        myCat.makeSound(); // Calls overridden method in Cat
    }
}
