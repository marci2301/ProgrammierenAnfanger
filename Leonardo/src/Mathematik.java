import edu.bielefeld.io.EAM;

public class Mathematik {

	public static void main(String[] args) {
		
		char a = 'j';
		while(a == 'J' || a == 'j'){
			
			StdOut.println("Bitte geben Sie die Rechenoperation (+,-,*,/) an: ");
			char eingabe = EAM.rChar();
			
			if(eingabe == '+'){
				StdOut.println("Bitte geben Sie den ersten Summand ein: ");
				int z1 = EAM.rInt();
				StdOut.println("Bitte geben Sie den zweiten Summand ein: ");
				int z2 = EAM.rInt();			
				
				int ergebnis = addiere(z1,z2);
				druckeErgebnis(eingabe, z1, z2, ergebnis);
			}
			else if(eingabe == '/'){
				StdOut.println("Bitte geben Sie den Dividend ein: ");
				int z1 = EAM.rInt();
				StdOut.println("Bitte geben Sie den Divisor ein: ");
				int z2 = EAM.rInt();		
				
				if(z2 == 0){
					StdOut.println("Divison durch 0 geht nicht!!!");
					continue;
				}
				
				int ergebnis = dividiere(z1,z2);
				druckeErgebnis(eingabe, z1, z2, ergebnis);			
			}
			else if(eingabe == '-'){
				StdOut.println("Bitte geben Sie den ersten Minuend ein: ");
				int z1 = EAM.rInt();
				StdOut.println("Bitte geben Sie den zweiten Subtrahent ein: ");
				int z2 = EAM.rInt();
				
				int ergebnis = subtrahiere(z1,z2);
				druckeErgebnis(eingabe, z1, z2, ergebnis);
			}
			else if(eingabe == '*'){
				StdOut.println("Bitte geben Sie den ersten Faktor ein: ");
				int z1 = EAM.rInt();
				StdOut.println("Bitte geben Sie den zweiten Faktor ein: ");
				int z2 = EAM.rInt();
				
				int ergebnis = multipliziere(z1,z2);
				druckeErgebnis(eingabe, z1, z2, ergebnis);
			}
			a = abfrage();
		}
		
		StdOut.println("Programm beendet!");

	}
	
	public static int addiere(int z1, int z2){
		int erg = z1+z2;
		return erg;
	}
	
	public static int subtrahiere(int z1, int z2){
		int erg = z1-z2;
		return erg;
	}
	
	public static int multipliziere(int z1, int z2){
		int erg = z1*z2;
		return erg;
	}
	
	public static int dividiere(int z1, int z2){
		int erg = z1/z2;
		//int mod = z1/z2;
		return erg;
	}
	
	public static void druckeErgebnis(char operator, int z1, int z2, int erg){
		StdOut.println("Die Berechnung von " + z1 + " " + operator + " " + z2 + " ergibt " + erg);
	}
	
	public static char abfrage(){		
		
		char z = 'z';

		while(z != 'j' && z != 'J' && z != 'n' && z != 'N'){
			StdOut.println("Moechten Sie eine weitere Aufgabe berechnen? (j/n):");
			 z = EAM.rChar();
			 
		}
		return z;
	}
}