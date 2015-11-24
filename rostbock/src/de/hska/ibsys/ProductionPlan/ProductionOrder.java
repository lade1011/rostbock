package de.hska.ibsys.ProductionPlan;

public class ProductionOrder{ 
	  public int articelNumber; 
	  public int amount; 
	  
	  public ProductionOrder(int aN, int a) { 
	    this.articelNumber = aN; 
	    this.amount = a; 
	  }

	public int getArticelNumber() {
		return articelNumber;
	}

	public void setArticelNumber(int articelNumber) {
		this.articelNumber = articelNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	} 
}
