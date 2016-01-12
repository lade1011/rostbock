package de.hska.ibsys.Components;

public class Workingtime {
	private int station;
	private int shift;
	private int overtime;
	
	public Workingtime(int station, int shift, int overtime) {
		super();
		this.station = station;
		this.shift = shift;
		this.overtime = overtime;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	
	
}
