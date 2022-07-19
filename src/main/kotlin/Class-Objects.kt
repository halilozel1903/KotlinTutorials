/*
Before you create objects in Kotlin, you need to define a class.
A class is a blueprint for the object.
We can think of class as a sketch (prototype) of a house. It contains all the details about the floors,
doors, windows etc. Based on these descriptions we build the house. House is the object.
Since, many houses can be made from the same description, we can create many objects from a class.
 */


class Lamp {

    // property data member
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus(lamp: String) {
        if (isOn) println("$lamp lamp is on.")
        else println("$lamp lamp is off.")
    }
}

/*
When class is defined, only the specification for the object is defined; no memory or storage is allocated.
To access members defined within the class, you need to create objects. Let's create objects of Lamp class.
 */

fun main() {

    val lamp1 = Lamp() // create lamp1 object of Lamp class
    val lamp2 = Lamp() // create lamp2 object of Lamp class

    lamp1.turnOn()
    lamp2.turnOff()

    lamp1.displayLightStatus("lamp1")
    lamp2.displayLightStatus("lamp2")
}