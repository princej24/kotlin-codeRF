// Define the Player class
data class Player(val name: String, val number: Int)


val players = mutableListOf<Player>()

fun main() {

    Players()

    while (true) {
        println("\nMenu:")
        println("1. Display all players")
        println("2. Display players with odd numbers")
        println("3. Display players with names that start with a letter")
        println("4. Add a player")
        println("5. Exit")

        // Get user input for menu choice
        val choice = readLine()?.toIntOrNull() ?: continue

        when (choice) {
            1 -> displayAllPlayers()
            2 -> displayPlayersWithOddNumbers()
            3 -> displayPlayersWithLetter()
            4 -> addPlayer()
            5 -> return
            else -> println("Invalid choice. Please try again.")
        }
    }
}
 // method for players
fun Players() {
    players.add(Player("jeff", 1))
    players.add(Player("Alice", 2))
    players.add(Player("sam", 3))
    players.add(Player("jay", 4))
    players.add(Player("David", 5))
}

// Method to display all players
fun displayAllPlayers() {
    println("\nAll Players:")
    for (player in players) {
        println("Name: ${player.name}, Number: ${player.number}")
    }
}


fun displayPlayersWithOddNumbers() {
    println("  \nPlayers with Odd Numbers:")
    for (player in players) {
        if (player.number % 2 != 0) {
            println("Name: ${player.name}, Number: ${player.number}")
        }
    }
}

// players  with specific letter
fun displayPlayersWithLetter() {
    println("Enter a letter:")
    val input = readLine()

    if (input != null && input.isNotBlank()) {
        val letter = input[0].uppercaseChar()

        println("\nPlayers with names starting with '$letter':")

        for (player in players) {
            if (player.name[0].uppercaseChar() == letter) {
                println("Name: ${player.name}, Number: ${player.number}")
            }
        }
    } else {
        println("Invalid input. Please enter a letter.")
    }
}

// Method to add a player to the list
fun addPlayer() {
    println("Enter th name of the new player:")
    val nameInput = readLine()

    if (nameInput != null && nameInput.isNotBlank()) {
        val name = nameInput

        println("Enter the number for the new player:")
        val numberInput = readLine()

        if (numberInput != null) {
            val number = numberInput.toIntOrNull()

            if (number != null) {
                val newPlayer = Player(name, number)
                players.add(newPlayer)

                println("Player added: Name: ${newPlayer.name}, Number: ${newPlayer.number}")
            } else {
                println("Invalid number. Please enter a valid number.")
            }
        } else {
            println("Invalid input. Please enter a number.")
        }
    } else {
        println("Invalid input. Please enter a name.")
    }
}

