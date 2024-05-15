package org.learning;

import java.util.Scanner;

public class MetaGala {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] guestList={ "Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        //inizializzo le variabili
        String guestName;
        String message ="Mi dispiace non è in lista";
        //chiedo all'utente il suo nome
        System.out.print("Qual'è il suo nome ?");
        guestName = (scanner.nextLine());
        for(int i = 0; i < guestList.length; i++){
            if (guestName.equals(guestList[i])){
                message="Benvenuto";
                break;
            }
        }
        System.out.print(message);
    }
}
