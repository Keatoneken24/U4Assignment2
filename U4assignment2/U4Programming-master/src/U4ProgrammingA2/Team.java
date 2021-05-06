package U4ProgrammingA2;

import java.util.Iterator;

public class Team extends Player implements Actions { // Adds a player to a stated team, including their First and Last names, then adding them to the Array

    Player player = new Player();

    public void teamPlayer(String firstName, String lastName, String teamName) { // This is used to bind the strings from the Player class, making them usable in thr Team class
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }

    @Override
    public void setFirstName() { // Overrides the data store for FirstName, updating it with information from the Team class
        player.setFirstName();
    }

    @Override
    public void setLastName() { // Overrides the data store for LastName, updating it with information from the Team class
        player.setLastName();
    }

    @Override
    public void setTeam() { // This takes the TeamName from the scanner input created by a user
        System.out.println("Enter team name");
        this.teamName = InputFactory.SC.next();
    }

    @Override
    public void add() {
        while (ShortStore.listTeam.size() <= 20) { // Limits how many teams can be added
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList(); 
        }
        Menu menu = new Menu();
    }

    @Override
    public void addToArrayList() {
        String deats = (player.firstName + "\t" + player.lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void view() { // This displays what teams are stored in the list
        if (ShortStore.listTeam.isEmpty()) { // Is used if there are no teams in the ArrayList
            System.out.println("You have no teams"); // This is printed when there are no teams in the ArrayList
        }
        for (Iterator<String> iterator = ShortStore.listPlayer.iterator(); iterator.hasNext(); ) {
            String team = iterator.next();
            System.out.println(team);
        }
    }

    @Override
    public void remove() { // Removes a team which is stored on the list
        ShortStore.listPlayer.clear(); 
    }
}
