package classobjectconstructor;

/*public class ConstructorInitBlock {

    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }

    // no-arg constructor
    ConstructorInitBlock()
    {
        System.out.println("default");
    }

    // constructor with one argument.
    ConstructorInitBlock(int x)
    {
        System.out.println(x);
    }

    {
        System.out.println("init block2");
    }

    public static void main(String[] args)
    {
        // Object creation by calling no-argument
        // constructor.
        new ConstructorInitBlock();

        // Object creation by calling parameterized
        // constructor with one parameter.
        new ConstructorInitBlock(10);
    }
}*/


/*class TempIntBlock
{
    // block to be executed first
    {
        System.out.println("init");
    }
    TempIntBlock()
    {
        System.out.println("default");
    }
    TempIntBlock(int x)
    {
        System.out.println(x);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }
    public static void main(String args[])
    {
        new TempIntBlock();
        new TempIntBlock(10);
    }
}*/


// Java code to illustrate order of
// execution of constructors, static
// and initialization blocks
 class ABC {

    int i = 2;
/*    static
    {
        i=10;
        System.out.println("1st static init");
    }*/


/*    {
        i=15;
        System.out.println("1st instance init");
    }
    {
        this.i=30;
        System.out.println("2nd instance init");
    }*/



 /*   static
    {
        i=20;
        System.out.println("2nd static init");
    }
*/


    final void updateData(int y){
        i = y;
    }

}

class GFG extends ABC
{

/*    void updateData(int y){
        i = i + y;
    }*/

    GFG()
    {
        //i=10;
        System.out.println("No  argument constructor" );
    }

/*    GFG(int x)
    {
        //i=x;
        System.out.println("ONE argument constructor");
    }*/
    public static void main(String[] args)
    {
        GFG huda = new GFG();
        huda.updateData(10);
        System.out.println(huda.i); //8
        //huda.updateData(10);
        GFG debasis = new GFG();
        debasis.updateData(20);
        System.out.println(debasis.i); //30
    }

}