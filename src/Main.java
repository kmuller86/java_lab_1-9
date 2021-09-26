import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String imie=scan.next();
        System.out.println("Podaj swoje nazwisko");
        String nazwisko=scan.next();
        System.out.println("Podaj swoj wiek");
         int wiek=scan.nextInt();
        System.out.println("Podaj numer indeksu");
        int indeks=scan.nextInt();
        System.out.println("Twoje imie to:"+imie +  "nazwisko:"+ nazwisko+"wiek:"+ wiek+ "numer indeksu:"+indeks );

        /*Zad 2*/
        int x=25;
        int y=2;
        int plus=x+y;
        int minus=x-y;
        int mnozenie=x*y;
        int dzielenie=x/y;
        int modulo=x%y;
        System.out.println("Wynik dodawania"+plus+"wynik odejmowania"+minus+"wynik mnozenia"+mnozenie+ "wynik dzielenia"+dzielenie+"wynik modulo"+ modulo);

    }
}
