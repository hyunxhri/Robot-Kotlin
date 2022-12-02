fun moveRobot(position:Array<Int>, listOfMovements:ArrayList<Array<Int>>) {
    var cont = 0
    var direction = ""
    for (movements in listOfMovements) {
        for (move in movements){
            when {
                cont == 0 -> {position[0] = position[0] + move; cont += 1; direction= "NEGATIVEX" }
                cont == 1 -> {position[1] = position[1] - move; cont += 1; direction= "NEGATIVEY" }
                cont == 2 -> {position[0] = position[0] - move; cont += 1; direction= "POSITIVEX" }
                cont == 3 -> {position[1] = position[1] + move; cont = 0; direction= "POSITIVEY" }
            }
        }
        println("x: ${position[1]}, y: ${position[0]}. Direction: $direction")
        position[0]= 0
        position[1]= 0
        cont=0
    }
}

fun main() {
    val robotPosition = arrayOf(0,0)
    val robotMovements = arrayListOf(
        arrayOf(10, 5, -2),
        arrayOf(0, 0, 0),
        arrayOf(),
        arrayOf(-10, -5, 2),
        arrayOf(-10, -5, 2, 4, -8)
    )
    moveRobot(robotPosition, robotMovements)
}
