package ch.jug.introduction.kotlin.h_delegation

interface Car {
    fun features(): List<String>
    fun brand(): String
}

class StandardCar : Car {
    override fun brand(): String {
        return "Audi"
    }

    override fun features(): List<String> {
        return listOf("4  wheeles", "roof", "radio")
    }
}

// TODO rbe: show remove by keyword
class SportCar(val car: Car) : Car by car{

    override fun features(): List<String> {
        return car.features().plus("air condition")
    }
}


//***
fun main(args: Array<String>) {
    val sportCar = SportCar(StandardCar())
    println(sportCar.brand())
    println(sportCar.features())
}



