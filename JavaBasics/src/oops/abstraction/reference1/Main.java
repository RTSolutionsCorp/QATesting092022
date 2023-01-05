package oops.abstraction.reference1;

//Observation 1: In Java, just like in C++ an instance of an abstract class cannot be created, we can have references to abstract class type though. It is as shown below via the clean java program.

// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
abstract class Base {
    abstract void fun();
}

// Class 2
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}

// Class 3
// Main class
class Main {

    // Main driver method
    public static void main(String args[])
    {

        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}