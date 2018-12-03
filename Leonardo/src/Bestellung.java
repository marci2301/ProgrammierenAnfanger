
public class Bestellung {
	
	private Artikel artikel;
	private int bestellmenge;
	
	public Bestellung(Artikel artikel, int bestellmenge){
		this.artikel = artikel;
		this.bestellmenge = bestellmenge;
	}

	public Artikel getArtikel() {
		return artikel;
	}
	
	public int getBestellmenge() {
		return bestellmenge;
	}

	public void setBestellmenge(int bestellmenge) {
		this.bestellmenge = bestellmenge;
	}
	
	public String toString(){
		return "Artikelnummer: " + artikel.getArtikelnummer() + " Artikelbezeichnung: " + artikel.getArtikelbezeichnung() + " Einzelpreis: " + artikel.getArtikelpreis() + " Bestellmenge: " + bestellmenge + " Gesamtpreis: " + (bestellmenge*artikel.getArtikelpreis());
	}
}