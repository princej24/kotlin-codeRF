// Define the Player class
data class Player(val name: String, val number: Int)

// Global list to store players
val players = mutableListOf<Player>()

fun main() {
    // Populate the array with 5 Players
    populatePlayers()

    // Display the menu to the user
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

// Method to populate the array with 5 players
fun populatePlayers() {
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

// Method to display players with odd numbers
fun displayPlayersWithOddNumbers() {
    println("\nPlayers with Odd Numbers:")
    for (player in players) {
        if (player.number % 2 != 0) {
            println("Name: ${player.name}, Number: ${player.number}")
        }
    }
}

// Method to display players with names that start with a letter entered by the user
fun displayPlayersWithLetter() {
    println("\nEnter a letter:")
    val letter = readLine()?.takeIf { it.isNotBlank() }?.toUpperCase()?.get(0) ?: return

    println("\nPlayers with Names Starting with '$letter':")
    for (player in players) {
        if (player.name.toUpperCase().startsWith(letter)) {
            println("Name: ${player.name}, Number: ${player.number}")
        }
    }
}

// Method to add a player to the list
fun addPlayer() {
    println("\nEnter the name of the new player:")
    val name = readLine()?.takeIf { it.isNotBlank() } ?1: return

    println("Enter the number for the new player:")
    val number = readLine()?.toIntOrNull() ?: return

    val newPlayer = Player(name, number)
    players.add(newPlayer)

    println("Player added: Name: ${newPlayer.name}, Number: ${newPlayer.number}")
}
