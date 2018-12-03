
public class Array4b {

	public static void main(String[] args) {
		
		int[] a = new int [100];
		int[] b = new int [100];
		
		for(int j=0; j<a.length; j++){
			a[j]=(int)(Math.random()*899+100);
			
			for(int i=100; i>0; i--){
				b[i-1] = a[j];
			}
		}
		
		for(int j=0; j<a.length; j++){
		StdOut.print(a[j] + " ");
		}
		StdOut.println("");
		for(int j=0; j<b.length; j++){
			StdOut.print(b[j] + " ");
			}
		
		
	}
}