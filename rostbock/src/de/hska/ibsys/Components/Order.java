package de.hska.ibsys.Components;

public class Order {
	private int id;
	
	private double lieferfrist;
	private double abweichung;
	private int verbrauchP1;
	private int verbrauchP2;
	private int verbrauchP3;
	private int diskontmenge;
	

	public Order(int id, double lieferfrist, double abweichung, int verbrauchP1, int verbrauchP2, int verbrauchP3,
			int diskontmenge) {
		super();
		this.id = id;
		this.lieferfrist = lieferfrist;
		this.abweichung = abweichung;
		this.verbrauchP1 = verbrauchP1;
		this.verbrauchP2 = verbrauchP2;
		this.verbrauchP3 = verbrauchP3;
		this.diskontmenge = diskontmenge;
	}

	public double sichereLieferfrist(){
		return this.lieferfrist + this.abweichung;
	}
}
