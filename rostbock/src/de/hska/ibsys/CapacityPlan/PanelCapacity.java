package de.hska.ibsys.CapacityPlan;

public class PanelCapacity {
	
	int arbeitszeiten[] = new int[15];
	int raestzeiten[] = new int[15];
	
	public PanelCapacity(int e4, int e5, int e6, int e7, int e8, int e9, int e10, int e11, int e12, int e13, int e14, int e15,int e16, int e17, int e18, int e19, int e20, int e26, int e29, int e30, int e31, int e49, int e50, int e51, int e54, int e55, int e56, int p1, int p2, int p3) {
		
		arbeitszeiten[0] = ( KapazitaetsbedarfBerechnen(e49,6) + KapazitaetsbedarfBerechnen(e5,6) + KapazitaetsbedarfBerechnen(e29,6) );
		arbeitszeiten[1] = ( KapazitaetsbedarfBerechnen(e50,5) + KapazitaetsbedarfBerechnen(e55,5) + KapazitaetsbedarfBerechnen(e30,5) );
		arbeitszeiten[2] = ( KapazitaetsbedarfBerechnen(e51,5) + KapazitaetsbedarfBerechnen(e56,6) + KapazitaetsbedarfBerechnen(e31,6) );
		arbeitszeiten[3] = ( KapazitaetsbedarfBerechnen(p1,6) + KapazitaetsbedarfBerechnen(p2,7) + KapazitaetsbedarfBerechnen(p3,7) );
		arbeitszeiten[4] = 0;
		arbeitszeiten[5] = ( KapazitaetsbedarfBerechnen(e16,2) + KapazitaetsbedarfBerechnen(e18,3) + KapazitaetsbedarfBerechnen(e19,3) + KapazitaetsbedarfBerechnen(e20,3) );
		arbeitszeiten[6] = ( KapazitaetsbedarfBerechnen(e10,2) + KapazitaetsbedarfBerechnen(e11,2) + KapazitaetsbedarfBerechnen(e12,2) + KapazitaetsbedarfBerechnen(e13,2) + KapazitaetsbedarfBerechnen(e14,2) + KapazitaetsbedarfBerechnen(e15,2) + KapazitaetsbedarfBerechnen(e18,2) + KapazitaetsbedarfBerechnen(e19,2) + KapazitaetsbedarfBerechnen(e20,2) + KapazitaetsbedarfBerechnen(e26,2) );
		arbeitszeiten[7] = ( KapazitaetsbedarfBerechnen(e10,1) + KapazitaetsbedarfBerechnen(e11,2) + KapazitaetsbedarfBerechnen(e12,2) + KapazitaetsbedarfBerechnen(e13,1) + KapazitaetsbedarfBerechnen(e14,2) + KapazitaetsbedarfBerechnen(e15,2) + KapazitaetsbedarfBerechnen(e18,3) + KapazitaetsbedarfBerechnen(e19,3) + KapazitaetsbedarfBerechnen(e20,3) );
		arbeitszeiten[8] = ( KapazitaetsbedarfBerechnen(e10,3) + KapazitaetsbedarfBerechnen(e11,3) + KapazitaetsbedarfBerechnen(e12,3) + KapazitaetsbedarfBerechnen(e13,3) + KapazitaetsbedarfBerechnen(e14,3) + KapazitaetsbedarfBerechnen(e15,3) + KapazitaetsbedarfBerechnen(e18,2) + KapazitaetsbedarfBerechnen(e19,2) + KapazitaetsbedarfBerechnen(e20,2) );
		arbeitszeiten[9] = ( KapazitaetsbedarfBerechnen(e4,5) + KapazitaetsbedarfBerechnen(e5,4) + KapazitaetsbedarfBerechnen(e6,4) + KapazitaetsbedarfBerechnen(e7,5) + KapazitaetsbedarfBerechnen(e8,4) + KapazitaetsbedarfBerechnen(e9,4) );
		arbeitszeiten[10] = ( KapazitaetsbedarfBerechnen(e4,3) + KapazitaetsbedarfBerechnen(e5,3) + KapazitaetsbedarfBerechnen(e6,3) + KapazitaetsbedarfBerechnen(e7,3) + KapazitaetsbedarfBerechnen(e8,3) + KapazitaetsbedarfBerechnen(e9,3) );
		arbeitszeiten[11] = ( KapazitaetsbedarfBerechnen(e10,3) + KapazitaetsbedarfBerechnen(e11,3) + KapazitaetsbedarfBerechnen(e12,3) + KapazitaetsbedarfBerechnen(e13,3) + KapazitaetsbedarfBerechnen(e14,3) + KapazitaetsbedarfBerechnen(e15,3) );
		arbeitszeiten[12] = ( KapazitaetsbedarfBerechnen(e10,2) + KapazitaetsbedarfBerechnen(e11,2) + KapazitaetsbedarfBerechnen(e12,2) + KapazitaetsbedarfBerechnen(e13,2) + KapazitaetsbedarfBerechnen(e14,2) + KapazitaetsbedarfBerechnen(e15,2) );
		arbeitszeiten[13] = ( KapazitaetsbedarfBerechnen(e16,3) );
		arbeitszeiten[14] = ( KapazitaetsbedarfBerechnen(e17,3) + KapazitaetsbedarfBerechnen(e26,3) );
		
	}
	
	public int KapazitaetsbedarfBerechnen (int auftragsmenge, int faktor)
	{
		return auftragsmenge*faktor;
	}
	
}
