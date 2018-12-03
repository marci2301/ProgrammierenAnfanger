
public class Array1 {

	public static void main(String[] args) {	
		
		int c=0;
		
		for(int j=0; j<1000; j++){
			double w=0;
					
			for(int i=0; i<10; i++){	
				
				w += Math.random();	
				
				if(w>7){
					c++;
					StdOut.println(c + ". Summe mit dem Wert: " + w);
				}				
			}			
		}
	}
}