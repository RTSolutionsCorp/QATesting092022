package classobjectconstructor;

public class ConstructorChaining {


    /**
     * Within same class: It can be done using this() keyword for constructors in the same class
     * From base class: by using super() keyword to call the constructor from the base class.
     *
     * Constructor chaining occurs through inheritance. A sub-class constructor’s task is to call super class’s constructor first.
     * This ensures that the creation of sub class’s object starts with the initialization of the data members of the superclass.
     * There could be any number of classes in the inheritance chain. Every constructor calls up the chain till the class at the top is reached.
     **/

    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class

    ConstructorChaining()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    ConstructorChaining(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstructorChaining(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        new ConstructorChaining();
    }
}


// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
// and changing order of constructors
class Temp
{
    // default constructor 1
    Temp()
    {
        System.out.println("default");
    }

    // parameterized constructor 2
    Temp(int x)
    {
        // invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    Temp(int x, int y)
    {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes parameterized constructor 3
        new Temp(8, 10);
    }
}