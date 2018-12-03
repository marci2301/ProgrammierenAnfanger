public class MainStartWarenkorb {

	public static void main(String[] args) {
		// Artikelliste als Array erstellen
				Artikel[] artliste = new Artikel[15];
				
				// Array mit neuen Artikeln f�llen
				artliste[0] = new Artikel(10001,"Handschuhe", 12.99);
				artliste[1] = new Artikel(10002,"Stiefel", 25.66);
				artliste[2] = new Artikel(10003,"Schaal", 5.99);
				artliste[3] = new Artikel(10004,"M�tze", 6.2);
				artliste[4] = new Artikel(10005,"Telefon", 299.90);
				artliste[5] = new Artikel(10006,"Teller", 2.99);
				artliste[6] = new Artikel(10007,"Kartoffeln", 2.55);
				artliste[7] = new Artikel(10008,"Haribo Gummib�rchen", 0.95);
				artliste[8] = new Artikel(10009,"Turnschuhe Addischlapp", 149.5);
				artliste[9] = new Artikel(10010,"Pullover", 12.99);
				artliste[10] = new Artikel(10011,"Hemd Sport", 12.33);
				artliste[11] = new Artikel(10012,"Tesafilm 10er", 7.50);
				artliste[12] = new Artikel(10013,"Fr�chtetee",1.89);
				artliste[13] = new Artikel(10014,"Tischlampe",26.99);
				artliste[14] = new Artikel(10015,"Stempelkissen",2.89);
				
				// Kundenliste als Array erstellen
				Kunde[] kdliste= new Kunde[2];
				// Array mit neuen Kunden  f�llen
				kdliste[0] = new Kunde(50001,"Frau","Walther","Edeltraut","Kurf�rstenstra�e 12a","32049","Herford");
				kdliste[1] = new Kunde(50002,"Herr","Thielmeier","Tim","Universit�tsstra�e 45","33615","Bielefeld");
				
				// Kundeinformation ausgeben
				System.out.println(kdliste[0]);
				System.out.println(kdliste[1]);
				System.out.println();
				// Warenkorb f�r den Kunden Walther erzeugen
				Warenkorb ww = new Warenkorb(1001,kdliste[0]);
				
				// Warenkorb f�r Kunden Thielmeier erzeugen
				Warenkorb wt = new Warenkorb(1002,kdliste[1]);
			
				// Bestellungen f�r Thielmeier ausf�hren
				wt.addBestellung(new Bestellung(artliste[3], 2));
				wt.addBestellung(new Bestellung(artliste[5], 3));
				wt.addBestellung(new Bestellung(artliste[11], 1));
				wt.addBestellung(new Bestellung(artliste[4], 1));
				wt.addBestellung(new Bestellung(artliste[11], 1));
				
				// Bestellungen f�r Walther ausf�hren
				ww.addBestellung(new Bestellung(artliste[3], 2));
				ww.addBestellung(new Bestellung(artliste[5], 3));
				ww.addBestellung(new Bestellung(artliste[1], 12));
				ww.addBestellung(new Bestellung(artliste[2], 2));
				ww.addBestellung(new Bestellung(artliste[1], 3));
				ww.addBestellung(new Bestellung(artliste[8], 1));
				ww.addBestellung(new Bestellung(artliste[5], 3));
				ww.addBestellung(new Bestellung(artliste[6], 1));
				ww.addBestellung(new Bestellung(artliste[7], 3));
				ww.addBestellung(new Bestellung(artliste[9], 1));
				ww.addBestellung(new Bestellung(artliste[13], 3));
//			
//				// Ausgabe des aktuellen Warenkorbes von Thielmeier 
//				wt.druckeListe();
//				
//				// Bestellung f�r Thielmeier erfassen
//				System.out.println();
//				wt.addBestellung(new Bestellung(artliste[11],5));
//				System.out.println("---Warenkorb Thielmeier: Artikel " + artliste[11].getArtikelbezeichnung() + " wird nochmalsbestellt (zus�tzliche Bestellmenge: 5).");
//				
//				// Ausgabe des aktuellen Warenkorbs von Thielmeier
//				wt.druckeListe();
//				
//				// Ausgabe des aktuellen Warenkorbes von Walther 
//				ww.druckeListe();
//				
//				// Artikel aus dem Warenkorb f�r Walther entfernen
//				System.out.println();
//				System.out.println("---Warenkorb Walther: Artikel aus Position 3 wird entfernt.");
//				ww.removeBestellung(3);
//				
//				// Ausgabe des aktuellen Warenkorbes von Walther 
//				ww.druckeListe();
//				
//				// Neuen Artikel f�r Walther bestellen
//				Bestellung bestellung = new Bestellung(artliste[14], 5);
//				ww.addBestellung(bestellung);
//				System.out.println();
//				System.out.println("---Warenkorb Walther: Bestellung - " + bestellung + " wurde hinzugef�gt.");
//				
//				// Ausgabe des aktuellen Warenkorbes von Walther 
//				ww.druckeListe();
			}

}
