package U4ProgrammingA2;

import static U4ProgrammingA2.InputFactory.SC; 

public class Menu {  // This is the menu interface, displayed to the user where they can input data

    private String sInput;

    public Menu() {
        int iInput;
        Player player = new Player();
        Team team = new Team();
        do {
            System.out.println("Select from the following:\n" + "1. Add Player    \t4. Add Team\n" + "2. View Player    \t5. View Team\n" + "3. Delete Player    \t6. Delete Team\n" + "7. Create Tournament" + "0. Exit\n");
            while (!InputFactory.SC.hasNextInt()) {  
                System.out.println("Whole numbers only"); // Printed text that is generated when inserted values do not meet the requirements, in this example, inserting anything other than integers will make the program print this line.
                InputFactory.SC.next(); 
            }
            iInput = InputFactory.SC.nextInt(); 
            if (iInput == 1) { // This is where the user is able to select an input
                player.add();
                break;
            } else 
                  if (iInput == 2) {
                player.view();
                break;
            } else 
                  if (iInput == 3) {
                player.remove();
                break;
            } else 
                  if (iInput == 4) {
                team.add();
                break;
            } else 
                  if (iInput == 5) {
                team.view();
                break;
            } else 
                  if (iInput == 6) {
                team.remove();
                break;
            }
        } while (iInput != 0);
    }

    public static void eventType() {
int iInput = 4;
        do {
            System.out.println("Single event or five?\n" + "1. Single\n" + "2. Five");
           
            try{
                iInput = SC.nextInt();
            }
            
            catch (Exception e){ 
                System.out.println("Please input a 1 or 2"); // Text shown when the validation is not satisfied
                InputFactory.SC.next();
            }
            
        } while (iInput < 0 || iInput > 2);
        if (iInput != 2) {
            Event.singleOrFiveEvents = 2;
            
          // These sections were changed due to needing to insert 2 values, along with not correctly validating for the correct numbers, 1 and 2
        }
        individualOrTeam();
    }

    public static void individualOrTeam() {
    int iInput = 4;
        do {
            System.out.println("Individual event or Team event?\n" + "1. individual\n" + "2. team");
           
            try{
                iInput = SC.nextInt();
            }
            
            catch (Exception e){
                System.out.println("Please input a 1 or 2"); // Text shown when the validation is not satisfied
                InputFactory.SC.next();
            }
            
        } while (iInput < 0 || iInput > 2);
        if (iInput != 2) {
            Event.singleOrFiveEvents = 2;
        }       
        sportingOrAcademic();
    }

    public static void sportingOrAcademic() {
int iInput = 4;
        do {
            System.out.println("Sporting or Academic?\n" + "1. Sporting\n" + "2. Academic");
           
            try{
                iInput = SC.nextInt();
            }
            
            catch (Exception e){
                System.out.println("Please input a 1 or 2");
                InputFactory.SC.next();
            }
            
        } while (iInput < 0 || iInput > 2);
        if (iInput != 2) {
            Event.singleOrFiveEvents = 2;
        }
    }

    public static String collate() {
        return "";
    }
}
