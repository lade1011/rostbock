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

	private ArrayList<Supply> arrivedSupply;

	private boolean withRush;

	private double bestellkosten;

	private int bedarfProd4;
	
	private int bedarfper1;
	private int bedarfper2;
	private int bedarfper3;
	private int bedarfper4;
	

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
		
		this.arrivedSupply = new ArrayList<Supply>();
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
		this.bedarfper1 = verbrauchP1 * correctPer.get(0) + verbrauchP2 * correctPer.get(1) + verbrauchP3 * correctPer.get(2); 
		this.bedarfper2 = verbrauchP1 * correctPer.get(3) + verbrauchP2 * correctPer.get(4) + verbrauchP3 * correctPer.get(5);
		this.bedarfper3 = verbrauchP1 * correctPer.get(6) + verbrauchP2 * correctPer.get(7) + verbrauchP3 * correctPer.get(8);
		this.bedarfper4 = verbrauchP1 * correctPer.get(9) + verbrauchP2 * correctPer.get(10) + verbrauchP3 * correctPer.get(11);
	}

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
		return false;
	}
	
	public boolean isRushOrder() {
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
	
	public int getBedarfProdukt(int prodauftragKind, int prodauftragDamen, int prodauftragHerren){
		int bK = this.bedarfProd1 * prodauftragKind;
		int bD = this.bedarfProd2 * prodauftragDamen;
		int bH = this.bedarfProd3 * prodauftragHerren;
		
		return bK + bD + bH;
	}


	public int getArrivedSupplyAmount() {
		int amount = 0;
		for (Supply supply : arrivedSupply) {
			amount += supply.getAmount();
		}
		return amount;
	}


	public void setArrivedSupply(Supply arrivedSupply) {
		this.arrivedSupply.add(arrivedSupply);
	}


	public int getBedarfper1() {
		return bedarfper1;
	}


	public void setBedarfper1(int bedarfper1) {
		this.bedarfper1 = bedarfper1;
	}


	public int getBedarfper2() {
		return bedarfper2;
	}


	public void setBedarfper2(int bedarfper2) {
		this.bedarfper2 = bedarfper2;
	}


	public int getBedarfper3() {
		return bedarfper3;
	}


	public void setBedarfper3(int bedarfper3) {
		this.bedarfper3 = bedarfper3;
	}


	public int getBedarfper4() {
		return bedarfper4;
	}


	public void setBedarfper4(int bedarfper4) {
		this.bedarfper4 = bedarfper4;
	}
}
