package de.hska.ibsys.ProductionPlan;

public class ArticleAmountPair implements Comparable<ArticleAmountPair>{ 
	  public int articelNumber; 
	  public int amount; 
	  
	  public ArticleAmountPair(int aN, int a) { 
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

	@Override
	public int compareTo(ArticleAmountPair po) {
		return this.articelNumber == po.articelNumber ? 0 : this.articelNumber < po.articelNumber ? -1 : 1;
	}
}
