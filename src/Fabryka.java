package src;
import java.util.IllegalFormatCodePointException;

public class Fabryka {

	public Fabryka() {
	}

	/**
	 * 
	 * @param dane
	 */
	public Sprzet wykonajSprzet(String[] dane) throws IllegalFormatCodePointException {
            Sprzet sprzet = null;
            switch (Integer.parseInt(dane[0])){
                case 0:
                    sprzet = new Sprzet("Dostepny", Float.parseFloat(dane[1]), dane[2]);
                    break;
                case 1:
                    sprzet = new Sprzet("Zarezerwowany", Float.parseFloat(dane[1]), dane[2]);
                    break;
                case 2:
                    sprzet = new Sprzet("Wypozyczony", Float.parseFloat(dane[1]), dane[2]);
                    break;
                default:
                    throw new IllegalFormatCodePointException(0);
            }
            return sprzet;
	}

}