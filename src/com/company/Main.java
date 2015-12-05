package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start programu.");
        System.out.println("Program do wypisywania dzielników liczby całkowitej.");
        System.out.println("Podaj liczbę całkowitą.");
        Scanner liczba = new Scanner(System.in);
        int n = liczba.nextInt();
        liczba.close();
        for (int i = 1; i<=n; i++){
            if (n%i==0) {
                System.out.println(i);
            }
        }
    }
}
