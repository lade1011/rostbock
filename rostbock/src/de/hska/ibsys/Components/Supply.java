package de.hska.ibsys.Components;

public class Supply {
	private int orderId;
	private int articleId;
	private int amount;
	private int orderPeriod;
	
	public Supply(int orderId, int articleId, int amount, int orderPeriod) {
		this.orderId = orderId;
		this.articleId = articleId;
		this.amount = amount;
		this.orderPeriod = orderPeriod;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getArticleId() {
		return articleId;
	}

	public int getAmount() {
		return amount;
	}

	public int getOrderPeriod() {
		return orderPeriod;
	}
	
}
