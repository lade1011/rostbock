package de.hska.ibsys.Components;

import java.util.ArrayList;

public class Consumption {
	private int id;
	
	private double lieferfrist;
	private double abweichung;
	private int verbrauchP1;
	private int verbrauchP2;
	private int verbrauchP3;
	private int diskontmenge;
	
	private double lagerbestand;
	private int bedarfProd1;
	private int bedarfProd2;
	private int bedarfProd3;
	
	private String bezeichnung;
	
	private double preis;
	
	private boolean toOrder;
	

	private boolean withRush;

	private double bestellkosten;

	public Consumption(int id, String bezeichnung, double lieferdauer, double abweichung, int verbrauchP1, int verbrauchP2, int verbrauchP3,
			int diskontmenge, double preis, double bestellkosten, int bp1, int bp2, int bp3) {
		this.id = id;
		this.lieferfrist = lieferdauer;
		this.bezeichnung = bezeichnung;
		this.abweichung = abweichung;
		this.verbrauchP1 = verbrauchP1;
		this.verbrauchP2 = verbrauchP2;
		this.verbrauchP3 = verbrauchP3;
		this.diskontmenge = diskontmenge;
		this.preis = preis;
		this.bestellkosten = bestellkosten;
		
		this.bedarfProd1 = bp1;
		this.bedarfProd2 = bp2;
		this.bedarfProd3 = bp3;
	}
	
	
	public double sichereLieferfrist(){
		return this.lieferfrist + this.abweichung;
	}
	
	public void setBedarf(ArrayList<Integer> per){
		ArrayList<Integer> correctPer = new ArrayList<Integer>();
		for(int p : per) {
			if(p<0) {
				p = 0;
			}
			correctPer.add(p);
		}

	}
	
//	public int bestandNachPeriode(int p){
//		switch(p) {
//			case 1:
//				return this.anfangsbestand - bedarfPeriode1;
//			case 2:
//				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2;
//			case 3:
//				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2 - bedarfPeriode3;
//			case 4: 
//				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2 - bedarfPeriode3 - bedarfPeriode4;
//			default:
//				return -999999999;
//		}
//	}
	

	public void setAnfangsbestand(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}


	public int getId() {
		return id;
	}


	public String getBezeichnung() {
		return bezeichnung;
	}

	public boolean isOrder() {
//		int per = (int) Math.ceil(sichereLieferfrist());
//		int bestand = bestandNachPeriode(per + 1);
//		if(bestand == -999999999) {
//			return false;
//		}
//		else if(bestand < 0) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return false;
	}
	
	public boolean isRushOrder() {
//		if(this.isOrder()) {
//			double rush = sichereLieferfrist()/2;
//			int per = (int) Math.ceil(rush);
//			
//			int bestand = bestandNachPeriode(per + 1);
//			if(bestand == -999999999) {
//				return false;
//			}
//			else if(bestand < 0) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		else {
//			return false;
//		}
		return false;
	}
	
	
	public boolean isToOrder() {
		return toOrder;
	}
	public void setToOrder(boolean toOrder) {
		this.toOrder = toOrder;
	}
	public boolean isWithRush() {
		return withRush;
	}
	public void setWithRush(boolean withRush) {
		this.withRush = withRush;
	}


	public int getDiskontmenge() {
		return diskontmenge;
	}


	public void setDiskontmenge(int diskontmenge) {
		this.diskontmenge = diskontmenge;
	}


	public int getLagerbestand() {
		return (int) lagerbestand;
	}


	public void setLagerbestand(double lagerbestand) {
		this.lagerbestand = lagerbestand;
	}
	
	public String getLieferdauerAbw(){
		return this.lieferfrist + " ("+this.abweichung+")";
	}


	public double getPreis() {
		return this.preis;
	}


	public int getBestellkosten() {
		return (int) bestellkosten;
	}
}
