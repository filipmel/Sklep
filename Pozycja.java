package main.java.com.sdabyd2.programowanie;

public class Pozycja {

    String nazwaTowaru;
    int ileSztuk;
    double cena;
    int id;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {

        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartoscPozycji() {
        return cena * ileSztuk;
    }

    public double obliczWartoscZRabatem() {

        double poRabacie = 0;

        if ((ileSztuk >= 5) && (ileSztuk <= 10)) {
            poRabacie = (cena * ileSztuk) * 0.95;
        } else if (((ileSztuk >= 10) && (ileSztuk <= 20))) {
            poRabacie = (cena * ileSztuk) * 0.90;
        } else if ((ileSztuk >= 20)) {
            poRabacie = (cena * ileSztuk) * 0.85;
        }
        return poRabacie;
    }

    public String toString() {

        return String.format("%-20s%-10s%-10s%-10s", nazwaTowaru, cena + " zł", ileSztuk + " szt.", "Pozycja razem " + obliczWartoscPozycji() + " zł");
    }
}
