package oops.abstraction.noabstructmethod3;

//Observation 3: In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated but can only be inherited. It is as shown below as follows with help of a clean java program.

// Java Program to illustrate Abstract class
// Without any abstract method

// Class 1
// An abstract class without any abstract method
abstract class Base {

    // Demo method. This is not an abstract method.
    void fun()
    {
        // Print message if class 1 function is called
        System.out.println("Function of Base class is called");
    }
}

// Class 2
class Derived extends Base {
    //This class only inherits the Base class methods and properties

}

// Class 3
class Main {

    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 2
        Derived d = new Derived();

        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
    }
}