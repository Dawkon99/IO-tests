/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
/**
 *
 * @author daw_k
 */
public class Dane {
    
    public String daneSprzetow[][] = new String[][]{
        {"0", "14.5", "Narty"}, {"0", "19", "Snowboard"},
        {"1", "1", "Kijki"}, {"1", "10", "Sanki"},
        {"2", "100", "Buty"}, {"2", "50", "Kask"},
        {"4", "5", "But"}
    };
    
    public float cenyKategorie [][] = {
        {144.5F, 144.5F, 144.5F, 144.5F, 144.5F},
        {175.5F, 175.5F, 175.5F, 175.5F, 175.5F}
    };
    
    public static Sprzet sprzety [] = {
        new Sprzet("Dostepny", 14.5F, "Narty", 20), new Sprzet("Dostepny", 19F, "Snowboard", 10),
        new Sprzet("Zarezerwowany", 1F, "Kijki", 20), new Sprzet("Zarezerwowany", 10F, "Sanki", 10),
        new Sprzet("Wypozyczony", 100F, "Buty", 50), new Sprzet("Wypozyczony", 50F, "Kask", 0),
    };
    
    public static Rachunek rachunki [] = {
        new Rachunek(new Sprzet("D", 13F, "narty")), new Rachunek(new Sprzet("Z", 15F, "snowboard")),
        new Rachunek(new Sprzet("D", 1F, "Kijki")), new Rachunek(new Sprzet("Z", 20F, "Kask"))
    };
    
    public float cenySprzetowNetto [] = {
        14.5F, 19F, 1F, 10F
    };
    
    public float cenySprzetow [] = {
        (float)17.400002, (float)20.9, (float)1.2, 11F, 150F, 50F, 0F};
    
    public float cenyRachunkow [] = {
        13F, 15F, 1F, 20F};
    
    public int numeryRezerwacji [] = {
        1, 2, 3, 4, 5, 6, 7
    };
    
    public String datyRezerwacji [] = {
        "2021.01.13", "2021.01.20", "2021.02.13", "2021.02.11",
        "2021.01.30", "2021.01.06", "2021.02.28"
    };
    
    public Rezerwacja rezerwacjeSprzet [] = {
        new Rezerwacja(1, "2021.01.13", this.sprzety[0]), new Rezerwacja(2, "2021.01.20", this.sprzety[1]),
        new Rezerwacja(3, "2021.02.13", this.sprzety[2]), new Rezerwacja(4, "2021.02.11", this.sprzety[3]),
        new Rezerwacja(5, "2021.01.30", this.sprzety[4]), new Rezerwacja(6, "2021.01.06", this.sprzety[5]),
        new Rezerwacja(7, "2021.02.28")
    };
    
    public Rezerwacja rezerwacje [] ={
        new Rezerwacja(1, "2021.01.13"), new Rezerwacja(2, "2021.01.20"),
        new Rezerwacja(3, "2021.02.13"), new Rezerwacja(4, "2021.02.11"),
        new Rezerwacja(5, "2021.01.30"), new Rezerwacja(6, "2021.01.06"),
        new Rezerwacja(7, "2021.02.28")
    };
    
    public String uzytkownicy [][] = {
        {"Login", "haslo", "imie", "nazwisko", "imie.nazwisko@poczta.pl"},
        {"Logi", "hasl", "imi", "nazwisk", "imi.nazwisk.@poczta.pl"},
        {"Log", "has", "im", "nazwis", "im.nazwis@poczta.pl"},
        {"Lo", "ha", "i", "nazwi", "i.nazwi@poczta.pl"}
    };
    
    public int liczbaUzytkownicy[] = {
        1, 2, 3, 4
    };
    
    
}
