// Final class - This class cannot be inherited
final class FinalClass {
    // Final variable - The value cannot be changed
    final String finalVariable = "This is a constant value";
    // Final method - Cannot be overridden in a subclass
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

// Trying to inherit the final class (This will cause a compile-time error)
// class ChildClass extends FinalClass { // Error: Cannot inherit from final class
// }

class FinalKeywordExample {
    public static void main(String[] args) {

        // Final variable - trying to change it will cause a compile-time error
        FinalClass obj = new FinalClass();
        System.out.println(obj.finalVariable);  // Output: This is a constant value
        
        // Uncommenting the line below will cause an error
        // obj.finalVariable = "New value"; // Error: finalVariable cannot be modified

        // Final method - Cannot be overridden
        obj.finalMethod();  // Output: This is a final method.
        
        // Trying to override the final method (this will cause a compile-time error)
        // class ChildClass extends FinalClass {
        //     public void finalMethod() {  // Error: Cannot override final method
        //         System.out.println("Attempting to override final method.");
        //     }
        // }
    }
}
