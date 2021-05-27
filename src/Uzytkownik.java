package src;

public class Uzytkownik {

	private String login;
	private String haslo;
	private String imie;
	private String nazwisko;
	private String email;

        public Uzytkownik(String login, String haslo, String imie, String nazwisko, String email){
            this.login = login;
            this.haslo = haslo;
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.email = email;
        }
        
        @Override
        public boolean equals(Object obj){
            Uzytkownik o = (Uzytkownik)obj;
            if (this.login.equals(o.login)){
                return true;
            }else{
                return false;
            }
        }
        
	public String getLogin() {
            return this.login;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(int login) {
		// TODO - implement U?ytkownik.setLogin
		throw new UnsupportedOperationException();
	}

	public void getImie() {
		// TODO - implement U?ytkownik.getImie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param imie
	 */
	public void setImie(int imie) {
		// TODO - implement U?ytkownik.setImie
		throw new UnsupportedOperationException();
	}

	public void getNazwisko() {
		// TODO - implement U?ytkownik.getNazwisko
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nazwisko
	 */
	public void setNazwisko(int nazwisko) {
		// TODO - implement U?ytkownik.setNazwisko
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Uzytkownik() {
		// TODO - implement U?ytkownik.U?ytkownik
		throw new UnsupportedOperationException();
	}

}