package data

internal class Axle(val numberOfWheels: Int) {

}

// para poder heredar de ella
open class VehicleInternal(var color: String) {

    private lateinit var axles: MutableList<Axle>

    fun info() {
        println("Color is $color")
    }

    fun addAxel(numberOfWheels: Int) {
        axles.add(Axle(numberOfWheels))
    }

}


class Truck(color: String) : VehicleInternal(color) {
    init {
        addAxel(2)
        addAxel(2)
    }
}