/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

/**
 *
 * @author ethan
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter your user ID: ");
        String userID = scan.nextLine();
        
        System.out.println("\nGenres:");
        for (int i = 0; i < UserProfile.getGenres().length; i++) {
            System.out.println(UserProfile.getGenres()[i]);
        }
        
        System.out.println("\nEnter a genre: ");
        String userGenre = scan.nextLine();
        
        UserProfile user = new UserProfile(userID, userGenre);
        
        System.out.println("\nHere is your user profile:");
        System.out.println("ID: " + user.getUserID());
        System.out.println("Genre: " + user.getGenre());
    }
    
           
}
