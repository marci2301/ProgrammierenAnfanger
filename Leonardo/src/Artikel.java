
public class Artikel {
	
	private int artikelnummer;
	private String artikelbezeichnung;
	private double artikelpreis;
	
	public Artikel(int artikelnummer, String artikelbezeichnung, double artikelpreis){
		this.artikelnummer = artikelnummer;
		this.artikelbezeichnung = artikelbezeichnung;
		this.artikelpreis = artikelpreis;
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}
	public String getArtikelbezeichnung() {
		return artikelbezeichnung;
	}

	public double getArtikelpreis() {
		return artikelpreis;
	}

	public void setArtikelpreis(double artikelpreis) {
		this.artikelpreis = artikelpreis;
	}
	
	public String toString(){
		return "Artikelnummer: " + artikelnummer + " Artikelbezeichnung: " + artikelbezeichnung + " Einzelpreis: " + artikelpreis; 
	}
}