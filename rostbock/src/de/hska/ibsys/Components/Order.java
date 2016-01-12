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
	

	private boolean withRush;

	private ArrayList<Supply> arrivedSupply;

	public Order(int id, double lieferfrist, double abweichung, int verbrauchP1, int verbrauchP2, int verbrauchP3,
			int diskontmenge) {
		this.id = id;
		this.lieferfrist = lieferfrist;
		this.abweichung = abweichung;
		this.verbrauchP1 = verbrauchP1;
		this.verbrauchP2 = verbrauchP2;
		this.verbrauchP3 = verbrauchP3;
		this.diskontmenge = diskontmenge;
		
		arrivedSupply = new ArrayList<Supply>();
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
		this.bedarfPeriode1 = verbrauchP1 * correctPer.get(0) + verbrauchP2 * correctPer.get(1) + verbrauchP3 * correctPer.get(2); 
		this.bedarfPeriode2 = verbrauchP1 * correctPer.get(3) + verbrauchP2 * correctPer.get(4) + verbrauchP3 * correctPer.get(5);
		this.bedarfPeriode3 = verbrauchP1 * correctPer.get(6) + verbrauchP2 * correctPer.get(7) + verbrauchP3 * correctPer.get(8);
		this.bedarfPeriode4 = verbrauchP1 * correctPer.get(9) + verbrauchP2 * correctPer.get(10) + verbrauchP3 * correctPer.get(11);
	}
	
	public int bestandNachPeriode(int p, int aktuellePeriode){
		switch(p) {
			case 1:
				return this.anfangsbestand - bedarfPeriode1 + supplyBisPeriode(p, aktuellePeriode);
			case 2:
				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2 + supplyBisPeriode(p, aktuellePeriode);
			case 3:
				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2 - bedarfPeriode3 + supplyBisPeriode(p, aktuellePeriode);
			case 4: 
				return this.anfangsbestand - bedarfPeriode1 - bedarfPeriode2 - bedarfPeriode3 - bedarfPeriode4 + supplyBisPeriode(p, aktuellePeriode);
			default:
				return -999999999;
		}
	}
	
	private int supplyBisPeriode(int p, int aktuellePeriode){
		if(aktuellePeriode == -1){
			return 0;
		}

		int suppliedAmount = 0;
		for (Supply supply : arrivedSupply) {
			if((supply.getOrderPeriod() + sichereLieferfrist()) < (aktuellePeriode + p)){
				suppliedAmount += supply.getAmount();
			}
		}
		return suppliedAmount;
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

	public boolean isOrder(int aktuellePeriode) {
		int per = (int) Math.ceil(sichereLieferfrist());
		int bestand = bestandNachPeriode(per + 1, aktuellePeriode);
		if(per >= 4){
			bestand = bestandNachPeriode(4, aktuellePeriode);
		}
		
		if(bestand == -999999999) {
			return false;
		}
		else if(bestand < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isRushOrder(int aktuellePeriode) {
		if(this.isOrder(aktuellePeriode)) {
			double rush = sichereLieferfrist()/2;
			int per = (int) Math.ceil(rush);
			
			int bestand = bestandNachPeriode(per + 1, -1);
			if(per >= 4){
				bestand = bestandNachPeriode(4, -1);
			}
			
			if(bestand == -999999999) {
				return false;
			}
			else if(bestand < 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
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
}
