package de.hska.ibsys.Components;

public class Articel {
	private long id;
	private int amount;
	private int startamount;
	private double pct;
	private double price;
	private double stockvalue;
	
	public Articel(long id, int amount, int startamount, double pct, double price, double stockvalue) {
		super();
		this.id = id;
		this.amount = amount;
		this.startamount = startamount;
		this.pct = pct;
		this.price = price;
		this.stockvalue = stockvalue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getStartamount() {
		return startamount;
	}

	public void setStartamount(int startamount) {
		this.startamount = startamount;
	}

	public double getPct() {
		return pct;
	}

	public void setPct(double pct) {
		this.pct = pct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStockvalue() {
		return stockvalue;
	}

	public void setStockvalue(double stockvalue) {
		this.stockvalue = stockvalue;
	}

	@Override
	public String toString() {
		return "Articel [id=" + id + ", amount=" + amount + ", startamount=" + startamount + ", pct=" + pct + ", price="
				+ price + ", stockvalue=" + stockvalue + "]";
	}
}
