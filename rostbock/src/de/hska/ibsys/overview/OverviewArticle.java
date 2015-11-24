package de.hska.ibsys.overview;

public class OverviewArticle {
	private int articleNumber;
	private String name;
	private char[] useage;
	private int actualStock;
	private int inQueue;
	private int inWork;
	private int productionOrders;
	
	public OverviewArticle(int articleNumber, String name, char[] useage, int actualStock, int inQueue, int inWork,
			int productionOrders) {
		super();
		this.articleNumber = articleNumber;
		this.name = name;
		this.useage = useage;
		this.actualStock = actualStock;
		this.inQueue = inQueue;
		this.inWork = inWork;
		this.productionOrders = productionOrders;
	}
	
	public int getArticleNumber() {
		return articleNumber;
	}
	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char[] getUseage() {
		return useage;
	}
	public void setUseage(char[] useage) {
		this.useage = useage;
	}
	public int getActualStock() {
		return actualStock;
	}
	public void setActualStock(int actualStock) {
		this.actualStock = actualStock;
	}
	public int getInQueue() {
		return inQueue;
	}
	public void setInQueue(int inQueue) {
		this.inQueue = inQueue;
	}
	public int getInWork() {
		return inWork;
	}
	public void setInWork(int inWork) {
		this.inWork = inWork;
	}
	public int getProductionOrders() {
		return productionOrders;
	}
	public void setProductionOrders(int productionOrders) {
		this.productionOrders = productionOrders;
	}
}
