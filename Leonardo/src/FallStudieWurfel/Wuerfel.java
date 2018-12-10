package FallStudieWurfel;

public class Wuerfel {
	
	private static int augen;
	
	public Wuerfel(){
		augen = 0;
	}
	
	public int wurf(){
		augen = (int)((Math.random()*6)+1);
		return augen;
	}

	public int getAugen(){
		
		if(augen == 0){
			wurf();
		}
		return augen;
	}
}
