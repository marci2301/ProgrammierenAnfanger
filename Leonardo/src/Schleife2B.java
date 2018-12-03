
public class Schleife2B {

	public static void main(String[] args) {
		
		int z1=1;
		StdOut.print(" " + z1 + " ");
		
		for(int i=1; i<100; i++){
			
			if(i%20 == 0){
				StdOut.println("");
			}
			
			z1+=37;
			if(z1>100){
				z1-=100;
			}
			if(z1<10){
				StdOut.print(" ");
			}
			if(z1<=100){
				StdOut.print(z1 +" ");
			}		
		}
	}
}
