
public class Kunde {
	
	private int kundennummer;
	private String anrede;
	private String name;
	private String vorname;
	private String anschrift;
	private String plz;
	private String ort;
	
	public Kunde(int kundennummer, String anrede, String name, String vorname, String anschrift, String plz, String ort){
		
		this.kundennummer = kundennummer;
		this.anrede = anrede;
		this.name = name;
		this.vorname = vorname;
		this.anschrift = anschrift;
		this.plz = plz;
		this.ort = ort;
	}

	public int getKundennummer() {
		return kundennummer;
	}
	
	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAnschrift() {
		return anschrift;
	}

	public void setAnschrift(String anschrift) {
		this.anschrift = anschrift;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public String toString(){
		return kundennummer + " " + anrede + " " + vorname + " " + name + " " + anschrift + " " + plz + " " + ort;
	}
}