package FallStudieWurfel;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Spieler {
	
	private String name;
	private Wuerfel[] w;
	private boolean weiter = true;
	
	public Spieler(String name){
		this.name = name;
		w = new Wuerfel[3];
		
		for(int wurf=0; wurf < w.length; wurf++){
			w[wurf] = new Wuerfel();
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public Wuerfel[] getWuerfel(){
		return w;
	}
	
	public int zeigeErgebnis(){
		
		int ergebnis = 0;
		StdOut.println("Spieler: " + name);
		
		for(int wurf=0; wurf < w.length; wurf++){
			StdOut.println("Augenzahl Wuerfel " + (wurf+1) + ": " + w[wurf].getAugen());
			ergebnis += w[wurf].getAugen();
		}
		StdOut.println("Gesamtergebnis: " + ergebnis);
		return ergebnis;
	}
	
	public void spiele(){
		int counter = 0;
		while(weiter && counter < 2){
		
			weiter = false;
			this.zeigeErgebnis();
			
			for(int wurf=0; wurf < w.length; wurf++){
				String a = "";
				StdOut.println("Moechten Sie den Wuerfel " + (wurf+1) + " nochmals werfen? (j/n):");
				a = StdIn.readString();
				
				if(a.startsWith("j")){
					w[wurf].wurf();
					weiter = true;
					counter++;
				}
			}
		}
		this.zeigeErgebnis();
	}
	
	public int getPunktzahl(){
		return this.zeigeErgebnis();
	}
}
