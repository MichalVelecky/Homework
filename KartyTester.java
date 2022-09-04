package uloha9_karty;

import java.util.Scanner;

public class KartyTester {
    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);

        System.out.print("Zadaj skrateny zapis karty: ");
        String skratka = vstup.nextLine();



        Karty karty = new Karty(skratka);

        System.out.println("Popis karty je: " + karty.getPopis());


    }

}