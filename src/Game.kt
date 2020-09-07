fun main() {
    var healthPoints: Int =100
    val playerName: String="Madrigal"
    var isBlessed = true;


    when(healthPoints){
        100-> println("$playerName is in excellent condition!")
        in 90..99 -> println("$playerName has a few scratches.")
        in 75..89 -> if (isBlessed)
                     { println("$playerName has some minor wounds but is healing quite quickly!")}
                     else { println("$playerName has some minor wounds.")  }
        in 15..74 ->println("$playerName looks pretty hurt.")
        else->{ println("$playerName is in awful condition!")    }

    }
    println("$playerName $healthPoints")


}