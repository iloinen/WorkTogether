package main;

public class Arti {
    //hahó most frissül?..

    public static void main(String[] args) {
        /* TODO
            Az alábbi feladatok félkész megoldása a feladat leírása alatti blokk-kommentben található.
            Kommentezd vissza a feladatokat (egyesével), és egészítsd ki a megoldást!
            A ??? helyére írd a megfelelő kódot. A programkód többi részét ne írd át!
            (Esetenként több ??? is szerepel a kódban.)
         */


        // 1. feladat ---------------------------------------------------------------------------------
         // TODO
          //  z értéke legyen x és y összege

/*
        int x = 5;
        int y = 7;
        int z = x+y;

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
       /*
        int n = 0;
        String result;

        if (n<0) {
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
        int number = 15;

        if (number %3==0 && number%5==0) {
            System.out.println("fizzbuzz");
        } else if (number %3==0) {
            System.out.println("fizz");
        } else if (number%5==0) {
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

        for (int i =end-start; i <= end; i++) {
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

    /*   int from = 10;
        int to = 33;

        while (from<to) {
            from++;
          int  number;
           if (number = 3 % ==0){
            System.out.println("fizz");
            } if(from%3==0){
            System.out.println("buzz");
            }else if (number = 3%==0 && 5%==0;){
            System.out.println("fizzbuzz");

        }
*/

        // 7.feladat
      /*
        double random1=Math.random();
        int randomInt=(int) (Math.random());
        */

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
        /*
        int randomInt =(int) (Math.random()*6+1);
        System.out.println(randomInt);
*/
        // ide jöhet a megoldásod :)

        // 10. feladat ---------------------------------------------------------------------------------
        /* TODO
            Generálj 100-szor egy random számot 1 és 6 között - beleértendő a két szélső értéket is.
            Számold meg, hogy melyik számot hányszor generálta a programod!
            A végén írd ki az eredményt a képernyőre!
         */

        int[] randomCounter = new int[6];

        for (int i = 0; i < 100; i++) {
            int randomInt=(int) Math.random()+6+1;
            if (randomInt==1)
                System.out.println("");

        }

        // írd ki a képernyőre, hogy melyik számot hányszor generálta a program

    }
}
