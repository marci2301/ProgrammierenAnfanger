
public class SchleifeA {
	
	public static void main(String[] args) {
		
		int n;
		int e = 0;
		
		System.out.println("Wie viele Quadratzahlen möchten Sie addieren?");
		System.out.print("Eingabe: ");
		n = StdIn.readInt();
		
		for(int i=1; i<=n; i++){
			
			e = e + i*i;
		}
		
		System.out.println("Ergebnis: " + e);
	}
}


