package de.hska.ibsys.Components;

public class Supply {
	private int orderId;
	private int articleId;
	private int amount;
	private int time;
	
	public Supply(int orderId, int articleId, int amount, int time) {
		this.orderId = orderId;
		this.articleId = articleId;
		this.amount = amount;
		this.time = time;
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

	public int getTime() {
		return time;
	}
	
}
