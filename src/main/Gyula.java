package main;

public class Gyula {
    public static void main(String[] args) {


        {
    /* TODO
            Az alábbi feladatok félkész megoldása a feladat leírása alatti blokk-kommentben található.
            Kommentezd vissza a feladatokat (egyesével), és egészítsd ki a megoldást!
            A ??? helyére írd a megfelelő kódot. A programkód többi részét ne írd át!
            (Esetenként több ??? is szerepel a kódban.)
         */


            // 1. feladat ---------------------------------------------------------------------------------
        /* TODO
            z értéke legyen x és y összege
         */
/*
        int x = 5;
        int y = 7;
        int z = x + y;

        System.out.println(x + " + " + y + " = " + z);
*/

            // 2. feladat ---------------------------------------------------------------------------------
        /* TODO
            c értéke legyen a és b közül a nagyobb szám
         */
/*
        int a = 5;
        int b = 7;
        int c = a > b ? a : b;

        System.out.println(a + " és " + b + " közül a nagyobbik szám: " + c);
*/

            // 3. feladat ---------------------------------------------------------------------------------
        /* TODO
            Állapítsd meg n-ről, hogy negatív-e vagy sem.
                Ha negatív, akkor a result nevű változó értéke legyen: "negatív".
                Ha nem negatív, akkor a result nevű változó értéke legyen: "nem negatív".
            (A nulla és a nála nagyobb számok nem negatívok.)
         */

           /* int n = 5;
            String result;

            if (n < 0) {
                result = "negatív";
            } else {
                result = "nem negatív";
            }

            System.out.println("A(z) " + n + " szám " + result);
*/

            // 4. feladat ---------------------------------------------------------------------------------
        /* TODO
            Állapítsd meg a number nevű változóról, hogy osztható-e 3-mal, 5-tel vagy mindkettővel!
                Ha osztható 3-mal, akkor írd ki a képernyőre, hogy "fizz"
                Ha osztható 5-tel, akkor azt írd ki, hogy "buzz"
                Ha 3-mal és 5-tel is osztható, akkor pedig azt, hogy "fizzbuzz"
         */
/*
        int number = 5;

        if (number % 3 ==0 && number % 5 ==0) {
            System.out.println("fizzbuzz");
        } else if (number%3==0) {
            System.out.println("fizz");
        } else if (number % 5 ==0 ) {
            System.out.println("buzz");
        }
*/

            // 5. feladat ---------------------------------------------------------------------------------
        /* TODO
            Add össze a számokat a start és az end változók értéke között! (A start és az end értékét is add hozzá az összeghez.)
            Az eredményt írd ki a képernyőre!
         */
/*
        int start = 5;
        int end = 10;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(sum);
*/

            // 6. feladat ---------------------------------------------------------------------------------
        /* TODO
            Állapítsd meg a from és a to változók értéke közötti számokról, hogy oszthatóak-e 3-mal, 5-tel vagy mindkettővel!
            (A from és a to értékét is vizsgáld!)
                Ha az aktuális szám osztható 3-mal, akkor írd ki a képernyőre, hogy "fizz"
                Ha osztható 5-tel, akkor azt írd ki, hogy "buzz"
                Ha 3-mal és 5-tel is osztható, akkor pedig azt, hogy "fizzbuzz"
         */
/*/* TODO
            Generálj random számot 0 és 10 között (mindkettő beleértendő)!
         */
           /* double random1 = Math.random();         // random1 >= 0.0 && random1 < 1.0
            int randomInt = (int) (Math.random() * 10 + 0);     // randomInt lehet: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            int randomInt2 = (int) (Math.random() * 11);     // randomInt2 lehet: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            long randomLong = (long) (Math.random() * Long.MAX_VALUE);

            // 8. feladat ---------------------------------------------------------------------------------
        /* TODO
            Generálj random számot 5 és 10 között!
         */

            /*int min = 5;
            int max = 11;

            for (int i = 0; i < 10; i++) {
                int random2 = (int) (Math.random() * (max - min) + min);

                if (random2 < 5 || random2 > 10) {
                    System.out.println("rossz szám! " + random2);
                }
            }

            System.out.println("ok");*/
            // 9. feladat ---------------------------------------------------------------------------------
        /* TODO
            Generálj random számot 1 és 6 között - beleértendő a két szélső értéket is.
            (Tehát a random szám értéke lehet: 1, 2, 3, 4, 5, 6)
            Ellenőrizd, hogy a szám valóban 1 és 6 közötti-e!
            (Például úgy, mint az előző feladatnál csináltuk.)
            Egészítsd ki az ellenőrzést azzal, hogy megnézed:
                - generált-e a program 1-et
                - generált-e a program 6-ot
         */

           /* int min = 0;
            int max = 7;

            for (int i = 0; i < 7; i++) {
                int random2 = (int) (Math.random() * (max - min) + min);

                if (random2 < 0 || random2 > 7) {
                    System.out.println("Nem jo! " + random2);
                }
                System.out.println("Jo szam");}} */

                // 10. feladat ---------------------------------------------------------------------------------
        /* TODO
            Generálj 100-szor egy random számot 1 és 6 között - beleértendő a két szélső értéket is.
            Számold meg, hogy melyik számot hányszor generálta a programod!
            A végén írd ki az eredményt a képernyőre!
         */

           /* int[] randomCounter = new int[6];

            for (int i = 0; i < 100; i++) {
                int random = (int) (Math.random() * 6 + 1);
                randomCounter[random - 1] += 1;
            }
            for (int i = 0; i < randomCounter.length; i++) {
            System.out.println((i + 1) + " generated " + randomCounter[i] + " times");

        /* int from = 10;
        int to = 33;

        while (???) {
            ???*/
            }}*/



}}