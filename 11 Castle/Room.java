public class Room {
    public String description;
    // to declare a variable named 'description' with type 'String' within the 'Room' class
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;

    public Room(String description)
    // This is a constructor
    // public: indicates that the constructor can be accessed by other classes.
    // Room: the name of the constructor, which matches the name of the class. In Java, constructors have the same name as the class they are in.
    // (String description): This is the parameter accepted by the constructor. 
    // It indicates that when a new Room object is created, a String argument, which is intended to be the description of the room, must be provided.

    {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    @Override
    public String toString()
    {
        return description;
    }
}
