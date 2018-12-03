public class SchleifeC {
	
	public static void main(String[] args) {
		StdOut.println("Welcher Wert soll ueberschritten werden?");
		int n = StdIn.readInt();
		int sum = 0;
		int j = 0;
		
		for(int i=1; i<n; i++){
			
			if(sum<n){
				
			sum += i; 	
			j = i;
			}	
		}
		StdOut.println("Summe: " + sum + " Anzahl der Summanden: " + j);
	}
}
