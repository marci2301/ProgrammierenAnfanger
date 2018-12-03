
public class Array4 {

	public static void main(String[] args) {

		int[] i = new int [100];
		
		for(int j=0; j<i.length; j++){
			i[j]=(int)(Math.random()*899+100);
		}
		
		int min=1000;
		
		for(int j=1; j<i.length; j++){
			if(min>i[j]){
				min=i[j];				
			}
		}	
		StdOut.println("Kleinste Zahl: " + min);
	}
}