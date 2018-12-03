
public class Array2 {

	public static void main(String[] args) {
		
		StdOut.println("Anzahl der Wiederholungen: ");
		int i = StdIn.readInt();		
		
		for(int j=0; j<i; j++){
			int sum = 0;
			int w = 0;
			int c = 0;
			
			 while(w!=6){
				 w = (int)(Math.random()*6+1);
				 c++;
				 sum += w;
			 }
			 int d = sum/c;
			 StdOut.println("Anzahl der benotigten Versuche: " + c + " Durchschnitt: " +d);
		}
	}
}