package cz.fei.upce.trojuhelnikkalkulackaapp;

import java.util.Scanner;

public class TrojuhelnikKalkulackaApp {

    public static void main(String[] args) {
        // Scanner pro nacitani vstupu od uzivatele
        Scanner scanner = new Scanner(System.in);

        // Zadavani odvesen trojuhelnika
        System.out.print("Zadejte odvesnu A: ");
        double odvesnaA = scanner.nextDouble();
        
        System.out.print("Zadejte odvesnu B: ");
        double odvesnaB = scanner.nextDouble();

        // Vypocet prepony trojuhelnika podle Pythagorovy vety
        double zakladna = Math.sqrt(Math.pow(odvesnaA, 2) + Math.pow(odvesnaB, 2));

        // Vypis vysledku
        System.out.printf("Zakladne je: %.2f", zakladna);
    }
}
