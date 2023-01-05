package oops.abstraction.unimeplemtedabsmethod9;
//Observation 9: If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method.

/*package whatever //do not write package name here */

abstract class Demo {
    abstract void m1();
    //abstract void m2();
    //abstract void m3();
}
abstract class FirstChild extends Demo {
    public void m1() {
        System.out.println("Inside m1");
    }
    public static void m4() {
        System.out.println("Inside m4");
    }
}

class SecondChild extends FirstChild {
    public void m2() {
        System.out.println("Inside m2");
    }
    public void m3() {
        System.out.println("Inside m3");
    }
}
class GFG {
    public static void main(String[] args)
    {
        // if we remove the abstract keyword from FirstChild
        // Class and uncommented below obj creation for
        // FirstChild then it will throw
        // compile time error as did't override all the
        // abstract methods

        // FirstChild f=new FirstChild();
        // f.m1();

        SecondChild s = new SecondChild();
        s.m1();
        s.m2();
        s.m3();
        FirstChild.m4();
    }
}