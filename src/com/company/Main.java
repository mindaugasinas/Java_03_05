package com.company;

import java.util.Scanner;

public class Main {
    public int[] masyvas;

    public int suma;

    public void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        masyvas = new int[5];
        suma = 0;
        System.out.println("Iveskite 5 skaicius");
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = sc.nextInt();
            suma += masyvas[i];

        }
    }

    public void isvedimas() {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);

        }
        System.out.println("Suma " + suma);
    }

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.nuskaitymas();
        objektas.isvedimas();


    }
}
