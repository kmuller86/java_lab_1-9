import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
             int z=4;
        System.out.println("Zmienna="+ z);
             String tekst="abcd";
        System.out.println(tekst);
        double zmiennadouble=12.6;
        System.out.println(zmiennadouble);
        boolean pytanie=true;
        System.out.println(pytanie);




        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *
        *
        *
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
         int a=4;
         int b=6;
         int wynik=a+b;
        System.out.println(wynik+"Dodawanie" );
        int wynik1=a-b;
        System.out.println(wynik1+"Odejmowanie");
        int wynik2=a*b;
        System.out.println(wynik2+"Mnożenie");
        int wynik3=a/b;
        System.out.println(wynik3+ "Dzielenie");
        int wynik4=a%b;
        System.out.println(wynik4+ "Modulo");
        double x=2.4;
        double y=3.5;
        double wynik5=x+y;
        System.out.println(wynik5+ "Dodawanie" );
        double wynik6=x-y;
        System.out.println(wynik6+ "Odejmowanie");
        double  wynik7=x*y;
        System.out.println(wynik7+ "Mnożenie");
        double wynik8=x/y;
        System.out.println(wynik8+ "Dzielenie");
        double wynik9=x%y;
        System.out.println(wynik9+ "Modulo");



    }
}
