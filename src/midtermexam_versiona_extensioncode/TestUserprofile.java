
package midtermexam_versiona_extensioncode;

import java.util.*;

/*
    Name:  [Amir Barakat]
    Assignment:  [Assignment 1]
    Program: [InvoiceApp]
    Date:  [June 3rd, 12:00pm]
    
    Description:
    [A program which takes input from the user checks for right input and puts it all into an invoice which is displayed after all information is present]
*/
public class TestUserprofile {

    private UserProfile user;
String id;
String genre;
    public TestUserprofile() {
        
        user = new UserProfile( id,  genre);
         
    }
/**
 
/**
 * 
     * @param input
 * @return takes all the input from user after being finished asking and validated
 */
    public UserProfile getUserprofile(Scanner input) {
      System.out.println("What is your ID?");
       id = input.nextLine();
       user.setUserID(id);
      System.out.println("What is your favourite genre Comedy, Drama, Action, Mystery");
       genre = input.nextLine();
       user.setGenre(genre);
        return user;
    }
/**
 * 
 * @return outputs all user input after entered and validated
 */
    @Override
    public String toString() {
        return "TestUserprofile{" + "user=" + user + '}';
    }
    
    
    /**
     * 
     * @param args main class will execute code and chain both classes together and input the code on screen for user input and outputs answer
     */
    public static void main(String[] args) {
       TestUserprofile profile = new TestUserprofile();
       Scanner input = new Scanner(System.in);
       profile.user = profile.getUserprofile(input);
        System.out.println("your user has been created");
    }
    
}
