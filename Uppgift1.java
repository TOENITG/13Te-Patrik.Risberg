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
         * String p� alla variabler innan koden b�rjade
         * f�r att l�ttare h�lla koll
         */
        System.out.println("Skriv ditt f�rnamn.");
        first_name=user_input.next();
        
        System.out.println("Skriv ditt efternamn.");
        family_name=user_input.next();
        
        System.out.println("Skriv ditt personnummer.");
        civic_number=user_input.next();
        
        System.out.println("Skriv din adress.");
        address=user_input.next();
        /**
         * Anv�ndaren skriver in sina uppgifter
         */
        
        System.out.println("V�lkommen " + first_name + ", d� du fyller den " + civic_number.substring(2, 6) + " kommer vi komma till dig, " + address + " och fira dig.");
        /**
         * "civic_number.substring(2, 6)" anv�nds f�r att markera siffrorna
         * 2 fram till 6 i anv�ndarens personnummer.
         * F�rsta talet �r tal 0
         */
    
    }
}
