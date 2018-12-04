
public class Warenkorb {
	
	private int warenkorbId;
	private Kunde kunde;
	private Bestellung[] liste;
	private int pos;
	
	public Warenkorb(int warenkorbId, Kunde kunde){
		
		this.warenkorbId = warenkorbId;
		this.kunde = kunde;
		Bestellung[] liste = new Bestellung[10];
		pos = 0;		
	}

	public int getWarenkorbId() {
		return warenkorbId;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public Bestellung[] getListe() {
		return liste;
	}
	
	public int getPos() {
		return pos;
	}
	
	public void addBestellung(Bestellung best){
		
		for(int i=0; i<this.pos; i++){
			
			if(liste[i].getArtikel().getArtikelnummer() == best.getArtikel().getArtikelnummer()){
				liste[i].setBestellmenge(liste[i].getBestellmenge() + best.getBestellmenge());
			}
			
			if(this.pos < this.liste.length){
				liste[pos] = best;
				pos++;
			}
			
			else{
				StdOut.println("Ihr Warenkorb ist voll!");
				StdOut.println("Folgende Bestellung kann nicht mehr aufgenommen werden: ");
				StdOut.println(best.toString());
			}
		}
	}
	
	public void removeBestellung(int pos) {
		
		if(liste[pos-1] == null) {
			StdOut.println("Sehr geehrte(r) " + kunde.getAnrede() + " " + kunde.getName() + " Die Bestellung mit der Positionsnummer " + pos + " konnte nicht geloscht werden!");
		}
		else {
			liste[pos-1] = null;
		}
	}
}
