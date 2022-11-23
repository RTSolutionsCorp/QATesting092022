package classobjectconstructor;

// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class Base
{
    String name;

    // constructor 1
    Base()
    {
        this("");
        System.out.println("No-argument constructor of" +
                " base class");
    }

    // constructor 2
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base " + name);
    }

    void fun(){
        System.out.println("I am parent fun()");
    }
}

class ConstructorSuperChaining extends Base
{
    // constructor 3
    ConstructorSuperChaining()
    {
        super();
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
/*    ConstructorSuperChaining(String name1, String name2)
    {
        // invokes base class constructor 2
        super(name2);
        this.name=name1;
        System.out.println("Calling parameterized " +
                "constructor of derived " + name1);
    }*/

    void fun(){
        System.out.println("I am derived fun()");
    }

    void laugh(){

    }

    public static void main(String args[])
    {
        // calls parameterized constructor 4
        Base bb = new Base();
 /*       ConstructorSuperChaining obj = new ConstructorSuperChaining("Shafiqul", "Huda");
        Base refObj = new ConstructorSuperChaining("Khadija", "Anika");
        refObj.fun()*/;

        // Calls No-argument constructor
        // Derived obj = new Derived();
    }
}