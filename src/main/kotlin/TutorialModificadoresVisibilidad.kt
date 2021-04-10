import data.Lambo
import data.Truck
import data.Vehicle
import data.VehicleInternal

fun main() {
/*    val p = Persona(name = "Jhoan",23)
    p.favoriteFood = "whaterMelon" are protected and throw error
    p.printMyFavoriteFood()
    val c = Chef(name = "dsd",23,"raices")
    c.setMyFavoriteFood("yuca")
    c.printMyFavoriteFood()*/


/*    val v = VehicleInternal(color = "red")
    val t = Truck(color = "Blue")*/

//    no se puede instanciar una clase abstracta
//    val av = Vehicle("red")
    val lambo = Lambo()
    driveVehicle(lambo)

}

fun driveVehicle(vehicle: Vehicle){
    vehicle.drive()
    vehicle.stop()
}