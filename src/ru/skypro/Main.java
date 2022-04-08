package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        {
            System.out.println();

        }


        // Задание 2
        int p = 6;
        while (p <= 27) {
            System.out.println(" Сегодня пятница " + p + " число. Необходимо подготовить отчет");
            p = p + 7;
        }


        // Задание 3

        for ( int x = 0; x <= 2100; x= x+ 79) {
            if ( x> 1850)
            System.out.println( x);

        }
    }
     }




