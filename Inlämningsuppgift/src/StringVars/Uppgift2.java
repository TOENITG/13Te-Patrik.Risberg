package StringVars;

import java.util.Scanner;

/**
 *
 * @author Patrik
 */
public class StringVars {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        String first;
        String second;
        String third;
        String fourth;
        String fifth;
        /**
         * String på alla variabler innan koden började
         * för att lättare hålla koll
         */
    
        System.out.println("Skriv ett ord i taget. Första ordet");
        first=user_input.next();
        /**
         * Koden lägger på ord för ord och härmar.
         * Koden lägger på ett mellanrum mellan varje ord.
         */
        System.out.println(first);
        second=user_input.next();
        
        System.out.println(first + " " + second);
        third=user_input.next();
        
        System.out.println(first + " " + second + " " + third);
        fourth=user_input.next();
        
        System.out.println(first + " " + second + " " + third + " " + fourth);
        fifth=user_input.next();
        
        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth);
        /**
         * Programmet är slut efter att ord fem upprepats.
         */
    }
}
<<<<<<< HEAD
=======

/*
Tack!
Snygg och enkel kod som fungerar.
Det hade blivit ännu kortare och i vissa fall enklare med en for-loop istället.
*/
>>>>>>> origin/master
