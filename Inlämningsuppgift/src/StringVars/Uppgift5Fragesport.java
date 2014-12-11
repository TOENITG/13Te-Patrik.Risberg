package StringVars;

/**
 *
 * @author Patrik
 */

import java.util.Scanner;

public class Uppgift5Fragesport {
    
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        String play;
        
        System.out.println("Tjeeenare, tjeeenare! Nu ska vi fråga lite här!\n");
        System.out.println("Ska vi ta första frågan då?\n");
        play=user_input.next();
        
        if (play.equals("nej")){
            System.out.println("Nej men då drar jag då... Hejdå!");   
        }
        
        else {
            System.out.println("\nJamen du då drar vi igång!\n\n");
        }
    }
    
}
