package U4ProgrammingA2;

public interface Actions { // This is the interface all of the methods are stored for use in other classes in the code, making it much easier to add and maintain classes if need be.

    public void add(); // Adds a player into a selected team, including other variables such as FirstName and LastName, Team and adds them into the ArrayList

    public void view(); // Shows a list of players in a team, however if there is no players it will prompt to enter them

    public void remove(); // Clears a player's data

    public void setFirstName(); // Sets the first name of a player when data is inputted

    public void setLastName(); // Sets the last name of a player when data is inputted 
 
    public void setTeam(); // This is used to set the team of an already existing player

    public void addToArrayList(); // Adds a team to a list
}
