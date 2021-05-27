package src;
public class Sprzet {

	private String status;
	private float cena;
        private float cenaBrutto = 0;
        private String nazwa;
        private float podatek;
        
        public Sprzet(String status, float cena, String nazwa) {
            this.status = status;
            this.cena = cena;
            this.nazwa = nazwa;   
            this.podatek = 0;
        }
        
	public Sprzet(String status, float cena, String nazwa, float podatek) {
            this.status = status;
            this.cena = cena;
            this.nazwa = nazwa;            
            this.podatek = podatek;
        }

        public float getPodatek(){
            return this.podatek;
        }
        
        public float obliczCenęBrutto(){
            this.cenaBrutto = this.cena * (1 + (this.podatek / 100));
            return this.cenaBrutto;
                    
        }
        
	public String getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public float getCena() {
		return this.cena;
	}

	/**
	 * 
	 * @param cena
	 */
	public void setCena(float cena) {
		this.cena = cena;
	}
        
        @Override
        public boolean equals(Object obj){
            Sprzet o = (Sprzet)obj;
            if (this.nazwa == o.nazwa && this.cena == o.cena){
                return true;
            }else{
                return false;
            }
        }

}