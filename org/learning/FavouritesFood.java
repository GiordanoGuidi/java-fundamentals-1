package org.learning;

public class FavouritesFood {
    public static void main(String[] args){
        String [] favouritesFoods={"pasta","pizza","sushi","bistecca","lasagna","patate"};
        //stampo la lunghezza dell'array
        System.out.println(favouritesFoods.length);
        //stampo il primo elemento dell'array
        System.out.println(favouritesFoods[0]);
        //stampo l'ultimo elemento dell'array
        System.out.println(favouritesFoods[5]);
        //stampo elemento a metà dell'array
        System.out.println(favouritesFoods[favouritesFoods.length / 2 -1]);
    }
}
