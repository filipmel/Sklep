package main.java.com.sdabyd2.programowanie;

public class Main {

    public static void main(String[] args) {

        Pozycja pozycja1 = new Pozycja("cukier", 1, 2.3);
        Pozycja pozycja2 = new Pozycja("cukier", 3, 4);
        Pozycja pozycja3 = new Pozycja("chleb", 2, 1.3);
        Pozycja pozycja4 = new Pozycja("sok", 3, 2);

        Zamowienie zam1 = new Zamowienie(10);

        zam1.dodajPozycje(pozycja1);
        zam1.dodajPozycje(pozycja2);
        zam1.dodajPozycje(pozycja3);
        zam1.dodajPozycje(pozycja4);

        zam1.pokazZamowienie();

        zam1.usunPozycje(1);

        zam1.pokazZamowienie();

        zam1.edytujPozycje(2, 12, 4, "cola");

        zam1.pokazZamowienie();
        System.out.println("Wartość całego zamówienia: " + zam1.obliczWartoscZamowienia());
        System.out.println("Wartość całego zamówienia po rabacie : " + zam1.obliczWartoscZamowieniazrabatem());

    }
}
