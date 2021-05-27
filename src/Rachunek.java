package src;
import java.util.ArrayList;
import java.util.Iterator;

public class Rachunek {

	private float suma;
        private ArrayList<Sprzet> sprzety;
        
        public Rachunek(){
            this.suma = 0;
            this.sprzety = new ArrayList();
        }
        
	public Rachunek(Sprzet sprzety) {
            this.suma = 0;
            this.sprzety = new ArrayList();
            this.sprzety.add(sprzety);
	}

	public float obliczSume() {
                this.suma = 0;
		Iterator<Sprzet> it = this.sprzety.iterator();
		Sprzet sprzet;
		float cena;
		while (it.hasNext()){
			sprzet = it.next();
			cena = sprzet.getCena();
			dodajWartoscDoSumy(cena);
		}
		return this.suma;
	}
        public void dodajSprzet(Sprzet sprzet){
            this.sprzety.add(sprzet);
        }

	public void setSuma(int suma) {
		// TODO - implement Rachunek.setSuma
		this.suma = suma;
	}
        
        public ArrayList<Sprzet> getSprzety(){
            return this.sprzety;
        }


	public float getWartosc() {
		// TODO - implement Rachunek.getWartosc
		throw new UnsupportedOperationException();
	}


        @Override
        public boolean equals(Object obj){
            Rachunek r = (Rachunek)obj;
            if(this.sprzety.containsAll(r.sprzety)){
                return true;
            }else{
                return false;
            }
        }
        
	public void dodajWartoscDoSumy(float wartosc) {

		this.suma += wartosc;
	}

}