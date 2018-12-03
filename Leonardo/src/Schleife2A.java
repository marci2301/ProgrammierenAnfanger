
public class Schleife2A {

	public static void main(String[] args) {
		
		int z1 = 1;
		int z2 = 1;

		StdOut.print(z1 + " " + z2 + " ");
		for(int i=0; i<18; i++){
					
			int h = z1+z2;
			StdOut.print(h + " ");
			z1 = z2;
			z2 = h;
		}
	}
}
