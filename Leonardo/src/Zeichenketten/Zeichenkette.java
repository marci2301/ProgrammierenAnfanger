package Zeichenketten;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Zeichenkette {
	
	public static void main(String[] args) {
		
		String zeichenkette = "";
		String eingabe;
		
		do{
			StdOut.println("Geben Sie einen String ein. Zum Beenden \" Ende \" eingeben: ");
			eingabe = StdIn.readString();
			
			if(!eingabe.startsWith("End")){
				
				zeichenkette+= eingabe;				
			}
		}while(!eingabe.startsWith("End"));	
	}
}
