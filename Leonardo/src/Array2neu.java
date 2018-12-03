
public class Array2neu {

	public static void main(String[] args) {
		
		StdOut.println("Anzahl der Wiederholungen: ");
		int i = StdIn.readInt();		
		int []spiele = new int[i-1];
				
		for(int j=0; j<spiele.length; j++){
			
			int w = 0;
			int c = 0;
			
			while(w!=6){
				w=(int)(Math.random()*6+1);
				c++;				
			}
			spiele[j]=c;			
		}
		
		int sum=0;		
		for(int k=0; k<spiele.length; k++){
			sum+=spiele[k];
		}		
		sum/=i;
		StdOut.println("Durchschnitt: " + sum);
	}
}
		