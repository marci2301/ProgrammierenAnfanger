
public class Array3 {

	public static void main(String[] args) {

		StdOut.println("Anzahl der Wiederholungen: ");
		int i = StdIn.readInt();		
		int []spiele = new int[i-1];
		
		for(int j=0; j<spiele.length; j++){
			
			int w1=0;
			int w2=1;
			int c=0;
			
			while(w1!=w2){
				w1=(int)(Math.random()*6+1);
				w2=(int)(Math.random()*6+1);
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