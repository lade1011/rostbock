package de.hska.ibsys.ProductionPlan;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {
	private List<ArticleAmountPair> numberAmountCombinations;

	public ProductionPlan() {
		super();
		this.numberAmountCombinations = new ArrayList<ArticleAmountPair>();
	}
	
	public void AddProductionOrder(ArticleAmountPair order){
		this.numberAmountCombinations.add(order);
		return;
	}

	public List<ArticleAmountPair> getNumberAmountCombinations() {
		return numberAmountCombinations;
	}
}
