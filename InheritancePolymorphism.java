// Parent class (Superclass)
class Shape {
    // Method to be overridden (Polymorphism)
    public void area() {
        System.out.println("Area of the given shape is ");
    }
}
// child class Square
class Square extends Shape {
    @Override
    public void area() {
        System.out.println("Area of a  Sqaure is side*side. ");
    }
}
// child class Rectangle
class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("Arae of a Rectangle is length*breadth. ");
    }
}
public class InheritancePolymorphism {
    public static void main(String[] args) {
        // Creating objects using superclass
        Shape mySquare = new Square();
        Shape myRectangle = new Rectangle();

        // Calling overridden methods
        mySquare.area(); 
        myRectangle.area(); 
    }
}
