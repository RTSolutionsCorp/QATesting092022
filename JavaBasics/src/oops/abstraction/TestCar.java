package oops.abstraction;

public class TestCar {

    String brandName;
    int no_of_wheel;

    TestCar(){
        System.out.println("this is default constructor");
    }

    TestCar(String brandName, int no_of_wheel){
        this();
        this.brandName = brandName;
        this.no_of_wheel = no_of_wheel;
    }

    String drives(){
        return this.brandName + " runs with " + this.no_of_wheel + " wheel";
    }

    void speeding(){

        System.out.println( this.drives()+ " and speed is at 250ml/hr" );
    }

    public static void main(String[] args) {

       /* Car corolla = new Toyota();
        corolla.start();
        corolla.stop();

        //cannot create object of interfaces and abstract classes
        //Car car = new Car();
        //ModernCar prius = new ModernCar();

        Toyota camry = new Toyota();
        camry.start();
        camry.stop();
        camry.autoRadio();*/

        TestCar tc = new TestCar("Toyota", 4);
        tc.speeding();
    }
}
