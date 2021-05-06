// This class is dedicated to storing the scanners used in the program
package U4ProgrammingA2; 

import java.util.Scanner; // Simply imports a scanner.

public class InputFactory {

    protected static Scanner SC = new Scanner(System.in);

    public static int checkInput(int iInput) { // This section is where user input is stored and is passed onto the Menu Class, where it is checked for what is contained
        return iInput; 
    }
}
