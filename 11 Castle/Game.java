import java.util.Scanner;

public class Game {
    private Room currentRoom;

    // private: This is an access modifier in Java. It means that the currentRoom variable can only be accessed within the Game class itself. Other classes cannot access or modify this variable directly. This is a part of encapsulation in object-oriented programming, which helps in maintaining the integrity of the data by restricting its direct access.

// Room: This indicates the type of the currentRoom variable. Room is a class that you've either created or imported from a library. This class likely defines the properties and behaviors of a room, such as its description, exits to other rooms, and any other relevant attributes or methods.

// currentRoom: This is the name of the variable. In the context of your game, currentRoom is used to keep track of the room in which the player is currently located. It is an instance of the Room class, so it can store all the information and functionalities that a Room object provides.
    // declares a variable named 'currentRoom' of the type 'Room'.
    
    public Game() 
    {
        createRooms();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        // Create rooms
        outside = new Room("Outside the castle");
        lobby = new Room("Lobby");
        pub = new Room("Pub");
        study = new Room("Study");
        bedroom = new Room("Bedroom");
        
        // Initialise the exits of the rooms
        outside.setExits(null, lobby, study, pub);
        lobby.setExits(null, null, null, outside);
        pub.setExits(null, outside, null, null);
        study.setExits(outside, bedroom, null, null);
        bedroom.setExits(null, null, null, study);

        currentRoom = outside;  // Start from outside the castle
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the castle!");
        System.out.println("This is a super boring game.");
        System.out.println("If you need help, please type 'help'.");
        System.out.println();
        System.out.println("Now you are in " + currentRoom);
        System.out.print("Exits are: ");
        if(currentRoom.northExit != null)
            System.out.print("north ");
        if(currentRoom.eastExit != null)
            System.out.print("east ");
        if(currentRoom.southExit != null)
            System.out.print("south ");
        if(currentRoom.westExit != null)
            System.out.print("west ");
        System.out.println();
    }

    // User commands

    private void printHelp() 
    {
        System.out.print("Lost? The commands you can do are: go bye help");
        System.out.println("For example:\tgo east");
    }

    private void goRoom(String direction) 
    {
        Room nextRoom = null;
        if(direction.equals("north")) {
            nextRoom = currentRoom.northExit;
        }
        if(direction.equals("east")) {
            nextRoom = currentRoom.eastExit;
        }
        if(direction.equals("south")) {
            nextRoom = currentRoom.southExit;
        }
        if(direction.equals("west")) {
            nextRoom = currentRoom.westExit;
        }

        if (nextRoom == null) {
            System.out.println("There is no door there!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println("You are in " + currentRoom);
            System.out.print("Exits are: ");
            if(currentRoom.northExit != null)
                System.out.print("north ");
            if(currentRoom.eastExit != null)
                System.out.print("east ");
            if(currentRoom.southExit != null)
                System.out.print("south ");
            if(currentRoom.westExit != null)
                System.out.print("west ");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game game = new Game();
        game.printWelcome();

        while ( true ) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            if ( words[0].equals("help") ) {
                game.printHelp();
            } else if (words[0].equals("go") ) {
                game.goRoom(words[1]);
            } else if ( words[0].equals("bye") ) {
                break;
            }
        }
        
        System.out.println("Thank you for visiting. Goodbye!");
        in.close();
    }
}
