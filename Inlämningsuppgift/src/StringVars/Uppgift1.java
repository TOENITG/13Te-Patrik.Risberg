package StringVars;

import java.util.Scanner;

/**
 *
 * @author Patrik
 */

public class Uppgift1 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        String first_name;
        String family_name;
        String civic_number;
        String address;
        
        System.out.println("Skriv ditt förnamn.");
        first_name=user_input.next();
        
        System.out.println("Skriv ditt efternamn.");
        family_name=user_input.next();
        
        System.out.println("Skriv ditt personnummer.");
        civic_number=user_input.next();
        
        System.out.println("Skriv din adress.");
        address=user_input.next();
        
        System.out.println("Välkommen " + first_name + ", då du fyller den " + civic_number.substring(2, 6) + " kommer vi komma till dig, " + address + " och fira dig."
    }
}

/*
Tack!

Det ser bra ut och du har löst uppgiften som det är tänkt!
Lösningen är enkel och lätt att följa.

*/