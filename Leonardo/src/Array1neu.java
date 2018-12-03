
public class Array1neu {

	public static void main(String[] args) {	
		
		//double [] w = new double[1000];
		double [] s = new double[10];
		int c = 0;
	
		for(int j=0; j<1000; j++){
			
			double sum = 0;
			for(int i=0; i<10; i++){
				
				s[i]= Math.random();	
								
			}
			
			for(int k=0; k<s.length; k++){
				sum += s[k];
				
				if(sum>7){
					c++;
					StdOut.println("Counter: " + c+ " Summe: " + sum);
				}
			}
		}
	}
}