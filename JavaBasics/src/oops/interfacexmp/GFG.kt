package oops.interfacexmp
//Real-World Example: Let’s consider the example of vehicles like bicycle, car, bike………, they have common functionalities. So we make an interface and put all these common functionalities. And lets Bicycle, Bike, car ….etc implement all these functionalities in their own class in their own way.

// Java program to demonstrate the
// real-world example of Interfaces

internal interface Vehicle {
    // all are the abstract methods.
    fun changeGear(a: Int)
    fun speedUp(a: Int)
    fun applyBrakes(a: Int)
}

internal class Bicycle : Vehicle {
    var speed = 0
    var gear = 0

    // to change gear
    override fun changeGear(newGear: Int) {
        gear = newGear
    }

    // to increase speed
    override fun speedUp(increment: Int) {
        speed = speed + increment
    }

    // to decrease speed
    override fun applyBrakes(decrement: Int) {
        speed = speed - decrement
    }

    fun printStates() {
        println("speed: " + speed
                + " gear: " + gear)
    }
}

internal class Bike : Vehicle {
    var speed = 0
    var gear = 0

    // to change gear
    override fun changeGear(newGear: Int) {
        gear = newGear
    }

    // to increase speed
    override fun speedUp(increment: Int) {
        speed = speed + increment
    }

    // to decrease speed
    override fun applyBrakes(decrement: Int) {
        speed = speed - decrement
    }

    fun printStates() {
        println("speed: " + speed
                + " gear: " + gear)
    }
}

internal object GFG {
    @JvmStatic
    fun main(args: Array<String>) {

        // creating an inatance of Bicycle
        // doing some operations
        val bicycle = Bicycle()
        bicycle.changeGear(2)
        bicycle.speedUp(3)
        bicycle.applyBrakes(1)
        println("Bicycle present state :")
        bicycle.printStates()

        // creating instance of the bike.
        val bike = Bike()
        bike.changeGear(1)
        bike.speedUp(4)
        bike.applyBrakes(3)
        println("Bike present state :")
        bike.printStates()
    }
}