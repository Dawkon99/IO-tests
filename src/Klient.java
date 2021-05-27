package src;
import java.util.ArrayList;

public class Klient extends Uzytkownik {

	private int liczbaRezerwacji;
        private ArrayList<Rezerwacja> rezerwacje;
        
        public Klient(String login, String haslo, String imie, String nazwisko, String email){
            super(login, haslo, imie, nazwisko ,email);
            this.liczbaRezerwacji = 0;
            this.rezerwacje = new ArrayList();
        }
        
        public void dodajRezerwacje(Rezerwacja rezerwacja){
            this.rezerwacje.add(rezerwacja);
        }

	public int getLiczbaRezerwacji() {
		return this.liczbaRezerwacji;
	}

	/**
	 * 
	 * @param liczbaRezerwacji
	 */
	public void setLiczbaRezerwacji(int liczbaRezerwacji) {
		this.liczbaRezerwacji = liczbaRezerwacji;
	}

}