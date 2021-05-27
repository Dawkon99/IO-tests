package src;
import java.util.ArrayList;



public class Rezerwacja {

	private int numerRezerwacji;
	private String data;
        public Rachunek rachunek;

	public Rezerwacja(int numerRezerwacji, String data) {
            this.numerRezerwacji = numerRezerwacji;
            this.data = data;
            this.rachunek = new Rachunek();
	}
        
        public Rezerwacja(int numerRezerwacji, String data, Sprzet sprzet) {
            this.numerRezerwacji = numerRezerwacji;
            this.data = data;
            this.rachunek = new Rachunek(sprzet);
	}
        
        public ArrayList<Sprzet> getSprzety(){
            return this.rachunek.getSprzety();
        }
        
        public int getNumer(){
            return this.numerRezerwacji;
        }

        public void zarezerwujSprzet(Sprzet sprzet){
            this.rachunek.dodajSprzet(sprzet);
        }
        
        public float obliczWartoscRezerwacji(){
            return this.rachunek.obliczSume();
        }

	public String getData() {
		return this.data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

	public void przypomnijOZwrocie() {

	}

}