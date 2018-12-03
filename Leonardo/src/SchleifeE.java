
public class SchleifeE {

	public static void main(String[] args) {
		double sum = 0;
		double i=1;
		
		while(sum<5){
			sum+=(1/i);
			i++;

			StdOut.println("Gliednr.: " + (int)i + " Summe: " + sum);
		}
	}
}