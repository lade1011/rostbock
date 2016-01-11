package de.hska.ibsys.help;

public class Definitions {

	public static String[] descriptions = {
			"Kinderfahrrad", "Damenfahrrad", "Herrenfahrrad",
			"Hinterradgruppe", "Hinterradgruppe", "Hinterradgruppe", 
			"Vorderradgruppe", "Vorderradgruppe", "Vorderradgruppe",
			"Schutzblech hinten", "Schutzblech hinten", "Schutzblech hinten",
			"Schutzblech vorne", "Schutzblech vorne", "Schutzblech vorne",
			"Lenker cpl.", "Sattel cpl.", "Rahmen", "Rahmen", "Rahmen",
			"Kette", "Kette", "Kette", "Mutter 3/8", "Scheibe 3/8", "Pedal cpl.",
			"Schraube 3/8", "Rohr 3/4", "Vorderrad mont.", "Rahmen und R�der", "Fahrrad ohne Pedal",
			"Farbe", "Felge cpl.", "Speiche", "Konus", "Freilauf", "Gabel", "Welle", "Blech",
			"Lenker", "Mutter 3/4", "Griff", "Sattel", "Stange 1/2", "Mutter 1/4", "Schraube 1/4",
			"Zahnkranz", "Pedal", "Vorderrad cpl.", "Rahmen und R�der", "Fahrrad ohne Pedal",
			"Felge cpl.", "Speiche", "Vorderrad cpl.", "Rahmen und R�der", "Fahrrad ohne Pedal",
			"Felge cpl.", "Speiche", "Schwei�draht"
			};
	
	public static String[] usage = {
			"K", "D", "H", "K", "D", "H", "K", "D", "H", "K", "D", "H", "K", "D", "H", "KDH", "KDH", "K", "D", "H",
			"K", "D", "H", "KDH", "KDH", "KDH", "KDH", "KDH", "H", "H", "H", "KDH", "H", "H", "KDH", "KDH",
			"KDH", "KDH", "KDH", "KDH", "KDH", "KDH", "KDH", "KDH", "KDH", "KDH", "KDH", "KDH", "K", "K", "K",
			"K", "K", "D", "D", "D", "D", "D", "KDH"
	};
	
	public static int[] startStockValues = {
			100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 300, 300, 100, 100, 100,
			300, 300, 300, 6100, 3600, 300, 1800, 4500, 100, 100, 100, 2700, 900, 22000, 3600, 900, 900, 300, 900,
			900, 900, 1800, 1900, 2700, 900, 900, 900, 1800, 100, 100, 100, 600, 22000, 100, 100, 100, 600, 22000, 1800	
	};
	
	public static String[] prodOrdersColumnNames = {
			"Artikel", "Menge"
			};
	
	public static String[] overviewColumnNames = {
			"Artikelnummer", "Bezeichnung", "Verwendung",
			"aktueller Lagerbestand", "Prozentual", "in Warteschlange", 
			"in Bearbeitung", "Produktionsauftr�ge"
			};
	public static String[] consumptionColumnNames = { "Art.", "Bezeichnung", "akt. Lagerbestand", "Lagerzugang",
			"Lfd. Abw.", "Diskontmenge", "Preis", "Best.kosten", "Bedarf P1",
			"Bedarf P2", "Bedarf P3", "Bedarf P4", "Anfangsb. P1", "Anfangsb. P2",
			"Anfangsb. P3", "Anfangsb. P4", "Anfangsb. P5" };
	
	public static String[] orderColumnNames = {
			"Teile-Nr.", "Akt. Bestand", "n. Per. 1",
			"n. Per. 2", "n. Per. 3", "n. Per. 4", 
			"Bestellmenge", "Bestellung", "Eilbestellung"
			};
	
}
