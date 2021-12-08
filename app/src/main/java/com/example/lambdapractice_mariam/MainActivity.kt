package com.example.lambdapractice_mariam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
data class Player(val name: String, val age: Int,val height:Int)    // تبع player

fun main() {
//////////////////////////////////////////////////////////////
    val greeting = { println("Holleworld") }  // Example1
    greeting()

//////////////////////////////////////////////////////////

    val sum = { a: Int, b: Int -> a + b }   // Example2
    val result = sum(5, 7)
    println(result)

/////////////////////////////////////////////////////////////////

    fun printName(first: String, last: String): String {
        return "My name is $first $last"
    } // Example3
    val lambdPrintName = { first: String, last: String ->
        "My name is $first $last"
    }
    println(printName("Mariam", "Al-harbi"))
    println(lambdPrintName("Mariam" ,"Al-harbi"))
////////////////////////////////////////////////////////////////////////
    fun grades(grade: Int): String {
        when {
            grade >= 100 -> return "Lambda Practice"
            else -> return "Fail"
        }
    }

    val lambdGrades = { grade: Int ->               // Example4
        when {
            grade >= 60 -> "Lambda Practice"
            else -> "Fail"
        }
    }



    println(grades(200))
    println(lambdGrades(200))


////////////////////////////////////////////////////////////////

    val player = listOf(    // Example5
        Player("Mariam:)", 24, 164),
        Player("Danny", 30, 169),
        Player("Lam", 25, 160),
        Player("jack", 25, 170),
        Player("Wedad", 30, 180),
        Player("Omar", 27, 181),
        Player("Meram", 10, 300),
        Player("Sare", 44, 1666),
        Player("Mariam:)", 24, 164),
        Player("Khaled", 30, 130),
        Player("Maryam2", 24, 164),
        Player("rose", 8, 30),
        Player("Charm", 32, 190),
        Player("Fatema", 28, 198),
        Player("Waleed", 27, 178),
        Player("Thean", 26, 189),
        Player("Esera", 25, 187),
        Player("Amain", 38, 183),
        Player("Mariam-h", 23, 164),
        Player("M_00", 31, 191),
        Player("Mona", 22, 186)


    )

    val lambdaSort = { player: List<Player> -> player.sortedBy { it.height } }
    val lambdaPrint = { lambdaSort: List<Player> ->
        for (player in lambdaSort) {



            println("Name: ${player.name},Age: ${player.age} Height: ${player.height}")


        }
    }
    lambdaPrint(lambdaSort(player))

}
