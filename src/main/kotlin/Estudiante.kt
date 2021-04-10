fun main() {
    val estudiante = Estudiante(nombre = "Ale", edad = 27, sexo = 'M', notas = arrayOf<Int>(12, 62, 3, 4, 5, 6))
    val estudiante2 = Estudiante(nombre = "Jo", edad = 27, sexo = 'F', notas = arrayOf<Int>(0, 4, 3, 4, 5, 1))
    val estudiante3 = Estudiante(nombre = "LA", edad = 27, sexo = 'F', notas = arrayOf<Int>(4, 4, 5, 4, 5, 6))
    val institucion = Institucion()

    println(estudiante.getMean())
    /*institucion.calcularPromedioDelStudiante(estudiante)
    institucion.calcularPromedioDelStudiante(estudiante2)
    institucion.calcularPromedioDelStudiante(estudiante3)

    println(institucion.chequearSiesAptoONO(estudiante))
    println(institucion.chequearSiesAptoONO(estudiante2))
    println(institucion.chequearSiesAptoONO(estudiante3))

    println(institucion.getNotasByEstudiante(estudiante2))*/

    println(institucion.calcularPromedioDelStudiante(estudiante2))

}
// Extensions
fun Array<Int>.promedio():Double {
    var sum = 0.0
    this.forEach {
        sum += it
    }
    return  sum / this.size
}
class Estudiante(
    val nombre: String,
    val edad: Int,
    val sexo: Char,
    var indiceAcademinco: Double = 0.0,
    val notas: Array<Int>
) {

    fun getMean():Double = notas.promedio()

    fun obtenerIndiceAcademico(): Double {

        var suma = 0.0
        notas.forEach {
            suma += it
        }
        indiceAcademinco = suma / notas.size
        return indiceAcademinco
    }

    fun leer() {
        println("YO se leer")
    }

    fun estudiar() {
        println("YO se estudiar")
    }

    fun aprender() {
        println("YO se aprender")
    }
}

class Institucion {

    fun getEstudiante(estudiante: Estudiante): String {
        return "Hola soy ${estudiante.nombre}"
    }

    fun getNotasByEstudiante(estudiante: Estudiante): String {
        return "Listado de notas: ${estudiante.notas.map { it }} del estudiante ${estudiante.nombre}"
    }

    fun calcularPromedioDelStudiante(estudiante: Estudiante): Double {
        if (estudiante.indiceAcademinco == 0.0) {
            var suma = 0.0
            estudiante.notas.forEach {
                suma += it
            }
            return suma / estudiante.notas.size
        } else {
            return estudiante.obtenerIndiceAcademico()
        }

    }

    fun chequearSiesAptoONO(estudiante: Estudiante): String {

        if (estudiante.indiceAcademinco >= 4.75) {
            return "${estudiante.nombre} Titulo de oro"
        } else if (estudiante.indiceAcademinco > 4.0) {
            var texto = "${estudiante.nombre} Apto para ser "
            if (estudiante.sexo == 'M') {
                texto += "profesor"
            } else {
                texto += "profesora"
            }
            return texto

        } else if (estudiante.indiceAcademinco < 4.0) {
            var texto = "${estudiante.nombre} NO Apto para ser "
            if (estudiante.sexo == 'M') {
                texto += "profesor"
            } else {
                texto += "profesora"
            }
            return texto
        } else {
            return "NO tiene promedio"
        }
    }

}