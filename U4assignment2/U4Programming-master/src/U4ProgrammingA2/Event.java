package U4ProgrammingA2;

public class Event { // This declares the type of event to be used in the program

    protected static int singleOrFiveEvents = 1;  

    protected static int individualOrTeam = 1;  

    protected static int sportingOrAcademic = 1; 
    
    // These methods declare the type of event via changing the value of variable, for example, for SingleorFiveEvents if the event is option 2 them the value is 5

    public static void registerForEvent() {
    }

    public static int getEvents() {
        return singleOrFiveEvents; // Returns 
    }

    public static void individualOrTeam() {
    }

    public static void updateScore() {
    }
}
