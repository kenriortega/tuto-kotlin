package data

abstract class Vehicle(
    val color: String,
    val numberOfdWheels: Int,
    val numberOfDoor: Int
) {
    abstract fun drive()
    abstract fun stop()
}

abstract class TwoDoorCar(
    color: String,
    numberOfdWheels: Int
) : Vehicle(color, numberOfdWheels, 2) {
    abstract fun driveFast()
    override fun drive() {
        driveFast()
    }

    override fun stop() {
        println("Stopping motors...")
    }


}

class Lambo() : TwoDoorCar(color = "black", 4) {
    override fun driveFast() {
        println("Run Fast")
    }
}

class Car(
    color: String,
    numberOfdWheels: Int,
    numberOfDoor: Int
) : Vehicle(color, numberOfdWheels, numberOfDoor) {
    override fun drive() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }


}