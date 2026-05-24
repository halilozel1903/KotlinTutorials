/**
 * Demonstrates class definition, object creation, and instance method calls.
 */
class Lamp {
    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus(label: String) {
        if (isOn) println("$label lamp is on.") else println("$label lamp is off.")
    }
}

/**
 * Creates two lamp objects and toggles each one independently.
 */
fun main() {
    val lamp1 = Lamp()
    val lamp2 = Lamp()

    lamp1.turnOn()
    lamp2.turnOff()

    lamp1.displayLightStatus("lamp1")
    lamp2.displayLightStatus("lamp2")
}