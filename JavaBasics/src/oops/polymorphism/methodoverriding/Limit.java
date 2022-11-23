//package oops.polymorphism.methodoverriding;
//
//// Java program to illustrate the fact that
//// runtime polymorphism cannot be achieved
//// by data members
//
//// class A
//class A1
//{
//    int x = 10;
//   void fun (){
//
//    }
//
//    void max(int x, int y){
//
//    }
//
//    void max(int a, int b){
//
//       //return 5;
//    }
//
//    void max(char x, int y){
//
//    }
//
//    void max(int y, char x){
//
//    }
//}
//
//// class B
//class B1 extends A1
//{
//
//    void joy(new A1()
//        {
//             void fun()
//            {
//                System.out.println("example of annonimus class");
//            }
//        });
//
//
//    int x = 20;
//}
//
//// Driver class
//public class Limit
//{
//    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        A1 a = new B1(); // object of type B
//        B1 b = new B1();
//        b.fun();
//        b.joy();
//        B1 obj = (B1)Class.forName("oops.polymorphism.methodoverriding.B1").newInstance();
//        obj.fun();
//        // Data member of class A will be accessed
//        System.out.println(a.x);
//    }
//}