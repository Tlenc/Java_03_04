package com.company;

import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0; /* konstanta */
    public static void main(String[] args) {
        Main objektas = new Main();
    }

    public Main() {
        float suma = 0;
        float sk = 0;
        do {
            sk = duokGarantuotaiSk();
            suma += sk;
        } while (sk != EXIT_CODE);
        System.out.println("Suma : " + suma);
    }
/* try catch */
    public float duokGarantuotaiSk() {
        float rezultatas = 0;
        Scanner sc = new Scanner(System.in);
        boolean arPavyko = false;
        while (arPavyko == false) {
            System.out.println("Įveskite skaičių");
            try {
                rezultatas = sc.nextFloat();
                arPavyko = true;
            } catch (Exception klaida) {
                System.out.println("Įvestas tekstas yra ne skaičius");
                sc.next();
            }
        }
        return rezultatas;
    }
}
