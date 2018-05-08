/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Samochod {

    private String marka;
    private String nazwa_samochodu;
    private int max_predkosc;
    private double cena;

    public Samochod() {
    }

    public Samochod(String marka, String nazwa_samochodu, int max_predkosc, double cena) {
        this.marka = marka;
        this.nazwa_samochodu = nazwa_samochodu;
        this.max_predkosc = max_predkosc;
        this.cena = cena;
    }
    
    public String toString() {
        return "Samochod: marka: " + this.marka + " nazwa_samochodu: " + this.nazwa_samochodu + " max_predkosc: " + this.max_predkosc + " cena: " + this.cena;
    }

    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return the nazwa_samochodu
     */
    public String getNazwa_samochodu() {
        return nazwa_samochodu;
    }

    /**
     * @param nazwa_samochodu the nazwa_samochodu to set
     */
    public void setNazwa_samochodu(String nazwa_samochodu) {
        this.nazwa_samochodu = nazwa_samochodu;
    }

    /**
     * @return the max_predkosc
     */
    public int getMax_predkosc() {
        return max_predkosc;
    }

    /**
     * @param max_predkosc the max_predkosc to set
     */
    public void setMax_predkosc(int max_predkosc) {
        this.max_predkosc = max_predkosc;
    }

    /**
     * @return the cena
     */
    public double getCena() {
        return cena;
    }

    /**
     * @param cena the cena to set
     */
    public void setCena(double cena) {
        this.cena = cena;
    }
}
