package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.IllegalFormatCodePointException;

public class Aplikacja{

	private ArrayList sprzety = new ArrayList<Sprzet>();
	private ArrayList rachunki = new ArrayList<Rachunek>();
	private ArrayList uzytkownicy = new ArrayList<Uzytkownik>();
	private ArrayList rezerwacje = new ArrayList<Rezerwacja>();

	public ArrayList<Sprzet> getSprzety() {
		return this.sprzety;
	}

	/**
	 * 
	 * @param sprzety
	 */
	public void setSprzety(ArrayList<Sprzet> sprzety) {
		this.sprzety = sprzety;
	}
        
        public void dodajSprzet(String [] dane) throws IllegalFormatCodePointException{
            Fabryka fabryka = new Fabryka();
            this.sprzety.add(fabryka.wykonajSprzet(dane));
        }

	public ArrayList<Rachunek> getRachunki() {
		return this.rachunki;
	}

	/**
	 * 
	 * @param rachunki
	 */
	public void setRachunki(ArrayList<Rachunek> rachunki) {
		this.rachunki = rachunki;
	}

	public ArrayList<Uzytkownik> getUzytkownicy() {
		return this.uzytkownicy;
	}

	/**
	 * 
	 * @param uzytkownicy
	 */
	public void setUzytkownicy(ArrayList<Uzytkownik> uzytkownicy) {
		this.uzytkownicy = uzytkownicy;
	}

	public Rezerwacja getRezerwacja(int numerRezerwacji) {
		Iterator<Rezerwacja> it = rezerwacje.iterator();
		Rezerwacja rezerwacja;
		while (it.hasNext()){
			rezerwacja = it.next();
			if (rezerwacja.getNumer() == numerRezerwacji){
				return rezerwacja;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param rezerwacje
	 */
	public void setRezerwacje(ArrayList<Rezerwacja> rezerwacje) {
		this.rezerwacje = rezerwacje;
	}

	/**
	 * 
	 * @param uzytkownik
	 */
	public void zaloguj(Uzytkownik uzytkownik) {
		// TODO - implement Aplikacja.zaloguj
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dane
	 */
	public void modyfikujSprzet(String[] dane) {


	}

	/**
	 * 
	 * @param numerRezerwacji
	 */
	public Rezerwacja szukajRezerwacji(int numerRezerwacji) {
		Rezerwacja rezerwacja;
		rezerwacja = getRezerwacja(numerRezerwacji);
		float suma;
		if (rezerwacja != null){
			suma = rezerwacja.rachunek.obliczSume();
			return rezerwacja;
		}
		return null;
	}
        
        public float obliczCeneRezerwacji(int numerRezerwacji){
            Rezerwacja rezerwacja = (Rezerwacja)this.rezerwacje.get(numerRezerwacji - 1);
            if (rezerwacja != null)
                return rezerwacja.obliczWartoscRezerwacji();
            return 0F;
        }

	/**
	 * 
	 * @param login
	 */
	public Klient szukajKlienta(String login) {
		// TODO - implement Aplikacja.szukajKlienta
		throw new UnsupportedOperationException();
	}

	public void przegladajKatalog() {
		// TODO - implement Aplikacja.przegladajKatalog
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numerRezerwacji
	 */
	public void anulujRezerwacje(int numerRezerwacji) {
		// TODO - implement Aplikacja.anulujRezerwacje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param klient
	 */
	public void stworzRezerwacje(Klient klient, int numerRezerwacji, String data, Sprzet sprzet) {
            Rezerwacja rezerwacja = new Rezerwacja(numerRezerwacji, data, sprzet);
            klient.dodajRezerwacje(rezerwacja);
            this.rezerwacje.add(rezerwacja);
	}

	/**
	 * 
	 * @param numerSprzetu
	 */
	public Sprzet szukajSprzet(int numerSprzetu) {
		// TODO - implement Aplikacja.szukajSprzet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param login
	 * @param haslo
	 * @param imie
	 * @param nazwisko
	 * @param email
	 */
	public void utworzKonto(String login, String haslo, String imie, String nazwisko, String email) {
            Klient uzytkownik = new Klient(login, haslo, imie, nazwisko, email);
            for (int i = 0; i < this.uzytkownicy.size(); i++){
                Uzytkownik u = (Uzytkownik)this.uzytkownicy.get(i);
                if (uzytkownik.equals(u)){
                    System.out.println("Istnieje juz takie konto");
                    return;
                }
            }
            this.uzytkownicy.add(uzytkownik);
	}

	/**
	 * 
	 * @param login
	 * @param dane
	 */
	public void modyfikujDaneKonta(String login, String[] dane) {
		// TODO - implement Aplikacja.modyfikujDaneKonta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
            System.out.print("Działa\n");
	}

}