package FallStudieWurfel;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Spielleiter {

	public static void main(String[] args) {
		
		StdOut.println("Wie viele Spieler spielen mit?");
		int anzahl = StdIn.readInt();
		Spieler[] sp = new Spieler[anzahl];

		
		for(int spieler = 0; spieler< sp.length; spieler++){
			StdOut.println("Bitte geben Sie den Namen des " + (spieler+1) + ". Teilnehmers ein: ");
			String name = StdIn.readString();
			sp[spieler] = new Spieler(name);
		}
		
		for(int spieler = 0; spieler< sp.length; spieler++){
			sp[spieler].spiele();			
		}
		
		for(int spieler = 0; spieler< sp.length; spieler++){
			String gewinner = "";
			int punktzahl = 0;
			
			if(punktzahl <= sp[spieler].getPunktzahl()){
				punktzahl = sp[spieler].getPunktzahl();
				gewinner = sp[spieler].getName();
				
			}
			StdOut.println(gewinner + " hat mit einer Gesamtpunktzahl von " + punktzahl + " gewonnen!");
		}
	}
}
