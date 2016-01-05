package de.hska.ibsys.Bike;

public class Bike {
	private int prognose;
	private int reserve;
	
	public Bike(int prognose, int reserve) {
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		if (prognose != other.prognose)
			return false;
		if (reserve != other.reserve)
			return false;
		return true;
	}
}
