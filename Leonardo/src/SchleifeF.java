
public class SchleifeF {

	public static void main(String[] args) {

		double s=0.11;
		double l=0.38;
		
		StdOut.println("Brutto  SozAbg  Steuer  Netto");
		StdOut.println("________________________________");
		
		for(int i=0; i<10; i++){
			int lohn = 1000+(100*i);
			double s1 = lohn*s;
			double l1 = lohn*l;
			
			double n = lohn-s1-l1;
			
			StdOut.println(lohn + "     " + (int)s1 + "     " + (int)l1 + "     " + (int)n);
		}
	}
}
