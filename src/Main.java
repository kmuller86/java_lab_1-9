import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
         int wiek=25;
        if(wiek%3==0)
             System.out.println("Podzielny przez 3");
         else
             System.out.println("Niepodzielny przez 3");

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int indeks=32975;
        int wynik  = (indeks % 2 == 0) ? 0 : 1;
        System.out.println(wynik);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("Podaj liczbę zmiennoprzecinkową");
        Scanner scan=new Scanner(System.in);
        double liczba=scan.nextDouble();
        if(liczba>5)
        {
            System.out.println("Do upieczenia ciasta potrzebujemy ponad 5 jajek");
        }
        else if(liczba<5)
        {
            System.out.println("Do upieczenia ciasta potrzebujemy mniej niż 5 jajek");
        }
        else if(liczba==5)
        {
            System.out.println("Do upieczenia ciasta potrzebujemy równo 5 jajek");
        }

    }
}
