package classobjectconstructor.classobjectmethod;

public class Hello {
    public static void main(String[] args) {
        //object is an instance of a class
        //syntax: ClassName objectName = new ClassName();
        //object of a class inherits all the class properties

        World myWorld = new World();
        //call variable: print variable name (world class)
        System.out.println(myWorld.name);

        //reassign the variable
        myWorld.name = "big john";
        System.out.println(myWorld.name);

        //call method once
        myWorld.addition1();

        //call the method again
        myWorld.addition1();

        //call the method one more time
        //a non-return method is a method that you cannot print
        //System.out.println(myWorld.addition1());

        //a return method is a method that we can print
        System.out.println(myWorld.subtraction());

        //call the addition2 method
        myWorld.addition2(4, 19);

        System.out.println(myWorld.subtraction2(199, 97));

        World jupiter = new World();

        jupiter.cToF(0);

        jupiter.cToF(23);

        System.out.println(jupiter.fToC(32));

        System.out.println(jupiter.fToC(75));



    }
}