package org.learning;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Inizializzo le variabiuli
        int kilometers, passengerAge;
        System.out.print("Number of kilometers: ");
        // leggo il valore come stringa da tastiera poi lo converto in int
        kilometers = Integer.parseInt(scanner.nextLine());
        System.out.print("Passenger age: ");
        //leggo il valore come stringa da tastiera poi lo converto in int
        passengerAge = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.21 * kilometers;
        //controllo se il passeggero è minorenne
        if (passengerAge < 18) {
            double discount = totalPrice * 20 / 100;
            totalPrice = totalPrice - discount;
        }
        //controllo se il passeggero è over 65
        else if (passengerAge > 65) {
            double discount = totalPrice * 40 / 100;
            totalPrice = totalPrice - discount;
        }
        System.out.println(totalPrice);
    }

}
