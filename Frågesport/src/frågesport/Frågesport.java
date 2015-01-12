package Frågesport;

/**
 *
 * @author Patrik
 */

import java.util.Scanner;

public class Frågesport {
    
    static Scanner user_input = new Scanner(System.in);
    
    String svar;
    if (svar.equalsignorecase(rättsvar));
    
    public static void main(String[] args) {
        
        String play;
        
        System.out.println("Tjeeenare, tjeeenare! Nu ska vi fråga lite här!\n");
        System.out.println("Ska vi ta första frågan då?\n");
        play=user_input.next();
        
        if (play.equals("nej")){
            System.out.println("Nej men då drar jag då... Hejdå!");
            System.exit(0);
        }
        
        else {
            System.out.println("\nJamen du då drar vi igång!\n\n");
        }
        
        System.out.println("Första frågan har vi här:\n");
        System.out.println("Who's that boy?");
        System.out.println("A: Batman, B: Juan Carlos, C: Carlito, D: Johannes");
        
        
            
        }
    }
    
}
