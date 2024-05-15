package org.learning;

public class FizzBuzz {
    public static void main(String[] args){
        for (int i= 1; i <= 100; i++){
            //controllo se il numero è divisibile sia per 3 che per 5
            if (i % 3 ==0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            //controllo se il numero è divisibile per 3
            else if (i % 3== 0) {
                System.out.println("Fizz");
            }
            //controllo se il numero è divisibile per 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
