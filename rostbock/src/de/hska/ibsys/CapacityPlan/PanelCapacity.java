package de.hska.ibsys.CapacityPlan;

public class PanelCapacity {
	
	int arbeitszeiten[] = new int[15];
	int rüstzeiten[] = new int[15];
	
	public PanelCapacity(int e4, int e5, int e6, int e7, int e8, int e9, int e10, int e11, int e12, int e13, int e14, int e15,int e16, int e17, int e18, int e19, int e20, int e26, int e29, int e30, int e31, int e49, int e50, int e51, int e54, int e55, int e56, int p1, int p2, int p3) {
		
		arbeitszeiten[0] = ( KapazitätsbedarfBerechnen(e49,6) + KapazitätsbedarfBerechnen(e5,6) + KapazitätsbedarfBerechnen(e29,6) );
		arbeitszeiten[1] = ( KapazitätsbedarfBerechnen(e50,5) + KapazitätsbedarfBerechnen(e55,5) + KapazitätsbedarfBerechnen(e30,5) );
		arbeitszeiten[2] = ( KapazitätsbedarfBerechnen(e51,5) + KapazitätsbedarfBerechnen(e56,6) + KapazitätsbedarfBerechnen(e31,6) );
		arbeitszeiten[3] = ( KapazitätsbedarfBerechnen(p1,6) + KapazitätsbedarfBerechnen(p2,7) + KapazitätsbedarfBerechnen(p3,7) );
		arbeitszeiten[4] = 0;
		arbeitszeiten[5] = ( KapazitätsbedarfBerechnen(e16,2) + KapazitätsbedarfBerechnen(e18,3) + KapazitätsbedarfBerechnen(e19,3) + KapazitätsbedarfBerechnen(e20,3) );
		arbeitszeiten[6] = ( KapazitätsbedarfBerechnen(e10,2) + KapazitätsbedarfBerechnen(e11,2) + KapazitätsbedarfBerechnen(e12,2) + KapazitätsbedarfBerechnen(e13,2) + KapazitätsbedarfBerechnen(e14,2) + KapazitätsbedarfBerechnen(e15,2) + KapazitätsbedarfBerechnen(e18,2) + KapazitätsbedarfBerechnen(e19,2) + KapazitätsbedarfBerechnen(e20,2) + KapazitätsbedarfBerechnen(e26,2) );
		arbeitszeiten[7] = ( KapazitätsbedarfBerechnen(e10,1) + KapazitätsbedarfBerechnen(e11,2) + KapazitätsbedarfBerechnen(e12,2) + KapazitätsbedarfBerechnen(e13,1) + KapazitätsbedarfBerechnen(e14,2) + KapazitätsbedarfBerechnen(e15,2) + KapazitätsbedarfBerechnen(e18,3) + KapazitätsbedarfBerechnen(e19,3) + KapazitätsbedarfBerechnen(e20,3) );
		arbeitszeiten[8] = ( KapazitätsbedarfBerechnen(e10,3) + KapazitätsbedarfBerechnen(e11,3) + KapazitätsbedarfBerechnen(e12,3) + KapazitätsbedarfBerechnen(e13,3) + KapazitätsbedarfBerechnen(e14,3) + KapazitätsbedarfBerechnen(e15,3) + KapazitätsbedarfBerechnen(e18,2) + KapazitätsbedarfBerechnen(e19,2) + KapazitätsbedarfBerechnen(e20,2) );
		arbeitszeiten[9] = ( KapazitätsbedarfBerechnen(e4,5) + KapazitätsbedarfBerechnen(e5,4) + KapazitätsbedarfBerechnen(e6,4) + KapazitätsbedarfBerechnen(e7,5) + KapazitätsbedarfBerechnen(e8,4) + KapazitätsbedarfBerechnen(e9,4) );
		arbeitszeiten[10] = ( KapazitätsbedarfBerechnen(e4,3) + KapazitätsbedarfBerechnen(e5,3) + KapazitätsbedarfBerechnen(e6,3) + KapazitätsbedarfBerechnen(e7,3) + KapazitätsbedarfBerechnen(e8,3) + KapazitätsbedarfBerechnen(e9,3) );
		arbeitszeiten[11] = ( KapazitätsbedarfBerechnen(e10,3) + KapazitätsbedarfBerechnen(e11,3) + KapazitätsbedarfBerechnen(e12,3) + KapazitätsbedarfBerechnen(e13,3) + KapazitätsbedarfBerechnen(e14,3) + KapazitätsbedarfBerechnen(e15,3) );
		arbeitszeiten[12] = ( KapazitätsbedarfBerechnen(e10,2) + KapazitätsbedarfBerechnen(e11,2) + KapazitätsbedarfBerechnen(e12,2) + KapazitätsbedarfBerechnen(e13,2) + KapazitätsbedarfBerechnen(e14,2) + KapazitätsbedarfBerechnen(e15,2) );
		arbeitszeiten[13] = ( KapazitätsbedarfBerechnen(e16,3) );
		arbeitszeiten[14] = ( KapazitätsbedarfBerechnen(e17,3) + KapazitätsbedarfBerechnen(e26,3) );
		
	}
	
	public int KapazitätsbedarfBerechnen (int auftragsmenge, int faktor)
	{
		return auftragsmenge*faktor;
	}
	
}
