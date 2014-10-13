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
        /**
         * String på alla variabler innan koden började
         * för att lättare hålla koll
         */
        System.out.println("Skriv ditt förnamn.");
        first_name=user_input.next();
        
        System.out.println("Skriv ditt efternamn.");
        family_name=user_input.next();
        
        System.out.println("Skriv ditt personnummer.");
        civic_number=user_input.next();
        
        System.out.println("Skriv din adress.");
        address=user_input.next();
        /**
         * Användaren skriver in sina uppgifter
         */
        
        System.out.println("Välkommen " + first_name + ", då du fyller den " + civic_number.substring(2, 6) + " kommer vi komma till dig, " + address + " och fira dig.");
        /**
         * "civic_number.substring(2, 6)" används för att markera siffrorna
         * 2 fram till 6 i användarens personnummer.
         * Första talet är tal 0
         */
    
    }
}
