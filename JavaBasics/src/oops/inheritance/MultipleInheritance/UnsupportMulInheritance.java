///*
//package oops.inheritance.MultipleInheritance;
//
//// Java Program to Illustrate Unsupportance of
//// Multiple Inheritance
//
//// Importing input output classes
//import java.io.*;
//
////  Class 1
//// First Parent class
//class Parent1 {
//
//    // Method inside first parent class
//    void fun() {
//
//        // Print statement if this method is called
//        System.out.println("Parent1");
//    }
//}
//
//// Class 2
//// Second Parent Class
//class Parent2 {
//
//    // Method inside first parent class
//    void fun() {
//
//        // Print statement if this method is called
//        System.out.println("Parent2");
//    }
//}
//
//// Class 3
//// Trying to be child of both the classes
//class UnsupportMulInheritance extends Parent1, Parent2 {
//
//    // Main driver method
//    public static void main(String args[]) {
//
//        // Creating object of class in main() method
//        UnsupportMulInheritance t = new UnsupportMulInheritance();
//
//        // Trying to call above functions of class where
//        // Error is thrown as this class is inheriting
//        // multiple classes
//        t.fun();
//    }
//}
////
////
////                GrandParent
////                  /     \
////                 /       \
////              Parent1      Parent2
////                 \       /
////                  \     /
////                   Test
//
//// Java Program to Illustrate Unsupportance of
//// Multiple Inheritance
//// Diamond Problem Similar Scenario
//
//// Importing input output classes
////import java.io.*;
//
////  Class 1
//// A Grand parent class in diamond
//class GrandParent {
//
//    void fun() {
//
//        // Print statement to be executed when this method is called
//        System.out.println("Grandparent");
//    }
//}
//
//// Class 2
//// First Parent class
//class Parent1 extends GrandParent {
//    void fun() {
//
//        // Print statement to be executed when this method is called
//        System.out.println("Parent1");
//    }
//}
//
//// Class 3
//// Second Parent Class
//class Parent2 extends GrandParent {
//    void fun() {
//
//        // Print statement to be executed when this method is called
//        System.out.println("Parent2");
//    }
//}
//
//// Class 4
//// Inheriting from multiple classes
//class Test extends Parent1, Parent2 {
//
//    // Main driver method
//    public static void main(String args[]) {
//
//        // Creating object of this class i main() method
//        Test t = new Test();
//
//        // Now calling fun() method from its parent classes
//        // which will throw compilation error
//        t.fun();
//    }
//}*/
