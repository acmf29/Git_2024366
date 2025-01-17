/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024366;

import java.util.Scanner;

/**
 *
 * @author acmfi
 */
public class Git_2024366 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Antonio Carlos Marques Filho - 2024366");
        
        Scanner myKB = new Scanner(System.in); // This is to create a scanner object to read user's input
        
        String userName; // Stores user name string
        
        do { // Open the loop
            
            System.out.println("Please enter your name: "); // Display message to the user asking for his name
            userName = myKB.nextLine(); // Read the line written by the user
    
            if (!userName.matches("[a-zA-Z!.?',& ]+")) { /* ! is negative sign, so this line will only run
                if the user has entered numbers or characters that don't match letters lower and upper case 
                and the written punctuation !.?',& and space
                */
                System.out.println("Error: Invalid input! Enter text only please, no numbers.");
                // Display this message if input is invalid
            }
            
        } while (!userName.matches("[a-zA-Z!.?',& ]+")); // Loop will continue until the user enters a valid input
        
        System.out.println("Very good! " + userName); // Prints user name
        System.out.println("Now let's make sure your name is all to Lower Case!"); /* Friendly message
        Explaining what will happen next
        */
        
        String userNameLowerCase = userName.toLowerCase(); /* Stores a new modified string 
        Converts full user name to lower case
        */
        System.out.println("That's better, " + userNameLowerCase); // Prints the modified user name
        
        System.out.println("It would be nice to see how is your name reversed"); // Explain what will happen next
        
        String userNameReversed = new StringBuilder(userNameLowerCase).reverse().toString(); /* Stores a new modified string
        and reverses the user name that was converted to lower case
        */
        System.out.println("Very funny haha, " + userNameReversed); // Print the reversed username
      
        System.out.println("I don't like letter A, if your name has letter A then I will change it to Z!"); /* Explains what
        will happen next
        */
        
        String userNameReplacedA = userNameReversed.replaceAll("a", "z"); /* Stores the new modified user name and replaces
        all letter a to z, it will work because before the user name was converted to lower case 
        */
        System.out.println("Now I am happy! Thank you! " + userNameReplacedA); // Prints the modified name
    }
    
}
