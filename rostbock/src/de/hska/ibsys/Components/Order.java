package de.hska.ibsys.Components;

import java.util.ArrayList;

public class Order {
	private int id;
	
	private double lieferfrist;
	private double abweichung;
	private int verbrauchP1;
	private int verbrauchP2;
	private int verbrauchP3;
	private int diskontmenge;
	
	private int bedarfPeriode1;
	private int bedarfPeriode2;
	private int bedarfPeriode3;
	private int bedarfPeriode4;
	
	private int anfangsbestand;
	private boolean toOrder;
	private boolean isRushOrder;

	public Order(int id, double lieferfrist, double abweichung, int verbrauchP1, int verbrauchP2, int verbrauchP3,
			int diskontmenge) {
//		this.anfangsbestand = 1000; //TODO entfernen
		this.id = id;
		this.lieferfrist = lieferfrist;
		this.abweichung = abweichung;
		this.verbrauchP1 = verbrauchP1;
		this.verbrauchP2 = verbrauchP2;
		this.verbrauchP3 = verbrauchP3;
		this.diskontmenge = diskontmenge;
		
		this.toOrder = false;
		this.isRushOrder = false;
	}
	
	
	public double sichereLieferfrist(){
		return this.lieferfrist + this.abweichung;
	}
	
	public void setBedarf(ArrayList<Integer> per1, ArrayList<Integer> per2bis4){
		this.bedarfPeriode1 = verbrauchP1 * per1.get(0) + verbrauchP2 * per1.get(1) + verbrauchP3 * per1.get(2); 
		this.bedarfPeriode2 = verbrauchP1 * per2bis4.get(0) + verbrauchP2 * per2bis4.get(1) + verbrauchP3 * per2bis4.get(2);
		this.bedarfPeriode3 = verbrauchP1 * per2bis4.get(3) + verbrauchP2 * per2bis4.get(4) + verbrauchP3 * per2bis4.get(5);
		this.bedarfPeriode4 = verbrauchP1 * per2bis4.get(6) + verbrauchP2 * per2bis4.get(7) + verbrauchP3 * per2bis4.get(8);
	}
	
	public int bestandNachPeriode(int p){
		switch(p) {
			case 1:
				return this.anfangsbestand - bedarfPeriode1;
			case 2:
				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2;
			case 3:
				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2 - bedarfPeriode3;
			case 4: 
				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2 - bedarfPeriode3 - bedarfPeriode4;
			default:
				return -1;
		}
	}
	

	public void setAnfangsbestand(int anfangsbestand) {
		this.anfangsbestand = anfangsbestand;
	}


	public int getId() {
		return id;
	}


	public int getAnfangsbestand() {
		return anfangsbestand;
	}


	public boolean isRushOrder() {
		return isRushOrder;
	}


	public void setRushOrder(boolean isRushOrder) {
		this.isRushOrder = isRushOrder;
	}
}
