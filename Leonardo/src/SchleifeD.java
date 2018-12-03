
public class SchleifeD {

	public static void main(String[] args) {
		
		int sum = 1;
		int k = 0;
		for(int i=0; i<=sum; i++){
			sum*=2;
			k = i;			
		}
		StdOut.println("Die Zahl 1 muss: " + k + " verdoppelt werden.");
	}
}
