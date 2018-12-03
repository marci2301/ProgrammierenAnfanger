
public class Student {
	
	private String name;
	private String vorname;
	private int matrikelnr;
	
	public Student(String name, String vorname, int matrikelnr){
		
		this.name = name;
		this.vorname = vorname;
		this.matrikelnr = matrikelnr;
	}
	
	public String toString(){
		return ("Name: " + name + " Vorname: " + vorname + " Matrikelnr: " + matrikelnr);
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getVorname(){
		return this.vorname;
	}
	public void setVorname(String vorname){
		this.vorname = vorname;
	}
	public int getMatrikelnr(){
		return this.matrikelnr;
	}
//	public void setMatrikelnr(int matrikelnr){
//		this.matrikelnr = matrikelnr;
//	}
}