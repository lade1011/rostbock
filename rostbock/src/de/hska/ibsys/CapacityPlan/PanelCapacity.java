package de.hska.ibsys.CapacityPlan;

public class PanelCapacity {
	private int prognose;
	private int reserve;
	
	public PanelCapacity(int prognose, int reserve) {
		this.prognose = prognose;
		this.reserve = reserve;
	}
	
	public int getPrognose() {
		return prognose;
	}

	public void setPrognose(int prognose) {
		this.prognose = prognose;
	}

	public int getReserve() {
		return reserve;
	}

	public void setReserve(int reserve) {
		this.reserve = reserve;
	}
}
