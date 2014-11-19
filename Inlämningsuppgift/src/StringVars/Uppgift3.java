package StringVars;

import java.util.Scanner;

/**
 *
 * @author Patrik
 */
public class Uppgift3 {
/**
 * debug
 * felsökningsprogrammet som heter debug testar om användaren skrivit in ett tal,
 * om inte skrivs ett felmeddelande ut.
 */
    static double debug(){
        Scanner user_input = new Scanner(System.in);
        boolean correct;
        double tal=0;
            do
            {
                try
                {
                    tal = Double.parseDouble(user_input.next( ));
                    correct=true;
                }
                
            catch(NumberFormatException e)
            {
                System.out.println("Du har inte skrivit ett godkänt tal. Försök en gång till!");
                correct=false;
            }
        }
        while(!correct);
        return tal;
    }
    public static void main(String[] args) {
        
        
        
        double
        first_number,second_number,third_number,fourth_number,fifth_number,answer_1,answer_2,answer_3,answer_4;
       /*
        string på alla variabler innan koden börjar
        */
        
        System.out.println("Skriv två tal som du vill addera med varandra.");        
        first_number = debug();
        second_number = debug();
        
        answer_1 = first_number + second_number;
        System.out.println("Svar = " + answer_1);
        /*
        användaren skriver in två tal som adderas med varandra
        talen räknas ihop och svaret skrivs
        */
        System.out.println("Skriv ett tal som du vill subtrahera svaret med.");
        third_number = debug();
        
        answer_2 = answer_1 - third_number;
        System.out.println("Svar = " + answer_2);
        /*
        användaren skriver ett tal som subtraheras från det första svaret
        */
        System.out.println("Skriv ett tal som du vill multiplicera svaret med.");
        fourth_number = debug();
        
        answer_3 = answer_2 * fourth_number;
        System.out.println("Svar = " + answer_3);
        /*
        användaren skriver ett tal som multipliceras med det andra svaret
        */
        System.out.println("Skriv ett tal som du vill dividera svaret med.");
        fifth_number = debug();
        
        answer_4 = answer_3 / fifth_number;
        System.out.println("Svar = "+ answer_4);
        /*
        användaren skriver ett tal som det tredje svaret divideras med
        */
    
    }
}