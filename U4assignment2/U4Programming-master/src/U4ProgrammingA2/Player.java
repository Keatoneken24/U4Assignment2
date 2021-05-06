package U4ProgrammingA2;

import java.util.Iterator;

public class Player implements Actions { // Is used to add a player with inputted data, adding them into the ListArray and into an individual team

    protected String firstName;

    protected String lastName;

    protected String teamName;

    int count = 0;

    public void player(String firstName, String lastName) { // This is implemeting the method from the Actions class, allowing for users to input custom data.
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = firstName + lastName;
    }

    public String getFirstName() { // Calls a first name that has been added 
        return firstName;
    }

    public String getLastName() { // Calls a last name that has been added
        return lastName;
    }

    public String getTeamName() { // Calls a team name that has been added
        return teamName;
    }

    @Override
    public void setFirstName() { // Allows for a user to input their first name
        System.out.println("Enter first name");
        this.firstName = InputFactory.SC.next();
    }

    @Override
    public void setLastName() { // Allows for a user to input their last name
        System.out.println("Enter last name");
        this.lastName = InputFactory.SC.next();
    }

    @Override
    public void setTeam() { // Allows for a user to select the team they are on
        this.teamName = firstName + lastName;
    }

    @Override
    public void addToArrayList() { // Allows for a user to input their first name
        String details = (firstName + "\t" + lastName + "\t" + teamName);
        ShortStore.listPlayer.add(details);
    }

    @Override
    public void add() { //
        while (ShortStore.listPlayer.size() <= 20) { // This is used to add new players into the tournament
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList();
        }
        Menu menu = new Menu();
    }

    @Override
    public void view() { // Views players stored in the list
        if (ShortStore.listPlayer.isEmpty()) {  // Checks whether or not a team has any players inside of it 
            System.out.println("Add players first");
        }
        System.out.println("list" + ShortStore.listPlayer);
        Iterator itr = ShortStore.listPlayer.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public void remove() { // Removes a player which is stored on the list
        ShortStore.listPlayer.clear();
    }
}
