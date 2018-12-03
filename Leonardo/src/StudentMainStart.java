
public class StudentMainStart {
	

	public static void druckeListe(Student[] s){
		for(int i=0; i<s.length; i++){
			StdOut.println(s[i]);
		}
	}

	public static void main(String[] args) {

		StdOut.println("Geben Sie die Anzahl der Studenten ein: ");
		int n = StdIn.readInt();		
		String [] name = new String [n];
		String [] vorname = new String [n];
		int [] matrikelnr = new int [n];
		Student [] student = new Student[n];
		String z = "leer";
		
		for(int i=0; i<n; i++){			
			StdOut.println("Name vom " + (i+1) + ". Studenten: ");
			name[i] = StdIn.readString();
			StdOut.println("Vorname vom " + (i+1) + ". Studenten: ");
			vorname[i] = StdIn.readString();
			StdOut.println("Matrikelnummer vom " + (i+1) + ". Studenten: ");
			matrikelnr[i] = StdIn.readInt();
			
			student[i] = new Student(name[i], vorname[i], matrikelnr[i]);
		}
		
			druckeListe(student);
			
			do{
				
				StdOut.println("Moechten Sie einen Datensatz aendern? (j/n)");
				z = StdIn.readString();
				
				if(z.equalsIgnoreCase("n")){
					break;
				}
				else{
					
					StdOut.println("Welcher Datensatz soll geaendert werden? (Stelle im Array)");
					int stelle = StdIn.readInt();
					
						if(stelle<0 || stelle>=student.length){
							StdOut.println("Falsche Stelle eingegeben!");
							continue;
						}
					StdOut.println("Was soll geandert werden? (name, vorname)");
					String aufgabe = StdIn.readString();
					
						switch(aufgabe){
						
						case "name" : StdOut.println("Geben Sie einen neuen Namen ein: ");
									  student[stelle].setName(StdIn.readString());
									  continue;
									  
						case "vorname": StdOut.println("Geben Sie einen neuen Vornamen ein: ");
										student[stelle].setVorname(StdIn.readString());
										continue;
						}									
					}
			
			}while(z.equalsIgnoreCase("j"));
			
			for(int i=0; i<n; i++){
				StdOut.println("Endzustand Array: ");
				StdOut.println(student[i]);		
			}
		StdOut.println("Programm beendet!");
	}
}