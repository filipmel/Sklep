package main.java.com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    int iledodanych;
    int maksRozmiar;

    List<Pozycja> pozycje = new ArrayList<>();

    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public void pokazZamowienie() {

        System.out.println("Twoje zamówienie: \n");

        for (Object el : pozycje) {
            System.out.println(el);
        }
        System.out.println("\nLiczba pozycji w zamówieniu: " + pozycje.size() + "\n");
    }

    public void dodajPozycje(Pozycja pozycja) {
        pozycje.add(pozycja);
    }

    public void usunPozycje(int indeks) {
        pozycje.remove(indeks);

    }

    public double obliczWartoscZamowienia() {
        double wartoscZamowienia = 0;

        for (int i = 0; i < pozycje.size(); i++) {
            wartoscZamowienia += pozycje.get(i).obliczWartoscPozycji();
        }

        return wartoscZamowienia;
    }

    public double obliczWartoscZamowieniazrabatem() {
        double wartoscZamowienia = 0;

        for (int i = 0; i < pozycje.size(); i++) {
            wartoscZamowienia += pozycje.get(i).obliczWartoscZRabatem();
        }

        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        return "Zamowienie: " + pozycje + "Razem: " + obliczWartoscZamowienia();
    }

    public void edytujPozycje(int indeks, double cena, int ileSztuk, String nazwaTowaru) {

        pozycje.get(indeks).cena = cena;
        pozycje.get(indeks).ileSztuk = ileSztuk;
        pozycje.get(indeks).nazwaTowaru = nazwaTowaru;
    }
}
