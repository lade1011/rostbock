package de.hska.ibsys.ProductionPlan;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {
	private List<ProductionOrder> numberAmountCombinations;

	public ProductionPlan() {
		super();
		this.numberAmountCombinations = new ArrayList<ProductionOrder>();
	}
	
	public void AddProductionOrder(ProductionOrder order){
		this.numberAmountCombinations.add(order);
		return;
	}

	public List<ProductionOrder> getNumberAmountCombinations() {
		return numberAmountCombinations;
	}
}
