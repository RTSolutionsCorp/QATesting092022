package classobjectconstructor.classobjectmethod;

public class World {//class can have only public and default keywords.modifiers
    /*
    OOP stands for object oriented programming
    java is all about classes and objects
    class is a blueprint / template for objects
    
    access keywords.modifiers: public, private, protected, default
    public property can be accessible from anywhere in the project
    private can be used only inside the same class
    default can be used only inside the same package
    ***protected is property that cannot be used in super class super class***
    access keywords.modifiers are applicable to classes and properties
     */

    //class properties

    //1- variables
    int a = 6;//a global variable
    String name = "john";//a global variable
    private char c = '$';//a global variable

    //2- method (function): reusable piece of code that does some work
    //syntax: methodType methodName(parameters) { work to do }
    //non-return method
    public void addition1(){
        int a = 3;//local variable
        int b = 4;//locale variable
        int total = a + b;
    }

    void addition2(int x, int y){//x and y are local variables
        int total = x + y;
        System.out.println(total);
    }

    //return method
    int subtraction(){
        int total = 3 - 4;
        return total;
    }

    int subtraction2(int x, int y){
        int total = x - y;
        System.out.println(a);
        return total;
    }

    //function that converts C to F
    void cToF(int tempToConvert){
        int tempConverted = (tempToConvert * 9/5) + 32;
        System.out.println(tempConverted);
        System.out.println(a);
    }

    int fToC(int tempToConvert){
        int tempConverted = (tempToConvert - 32) * 5/9;
        return tempConverted;
    }

}
