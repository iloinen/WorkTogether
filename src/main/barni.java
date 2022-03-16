package main;

import java.util.Scanner;

public class barni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Kérel a színt!");
        String light = sc.nextLine();

        if (light.equalsIgnoreCase("zöld")) {
            System.out.println("SZABAD!");
        } else if (light.equalsIgnoreCase("sárga")) {
            System.out.println("LASSÍTS!");
        } else if (light.equalsIgnoreCase("piros")) {
            System.out.println("MEGÁLLJ!");
        } else {
            System.out.println("NEM TUDOM!");
        }


    }
}
