package de.hska.ibsys.CapacityPlan;

public class PanelCapacity {
	
	int arbeitszeiten[] = new int[15];
	int r�stzeiten[] = new int[15];
	
	public PanelCapacity(int e4, int e5, int e6, int e7, int e8, int e9, int e10, int e11, int e12, int e13, int e14, int e15,int e16, int e17, int e18, int e19, int e20, int e26, int e29, int e30, int e31, int e49, int e50, int e51, int e54, int e55, int e56, int p1, int p2, int p3) {
		
		arbeitszeiten[0] = ( Kapazit�tsbedarfBerechnen(e49,6) + Kapazit�tsbedarfBerechnen(e5,6) + Kapazit�tsbedarfBerechnen(e29,6) );
		arbeitszeiten[1] = ( Kapazit�tsbedarfBerechnen(e50,5) + Kapazit�tsbedarfBerechnen(e55,5) + Kapazit�tsbedarfBerechnen(e30,5) );
		arbeitszeiten[2] = ( Kapazit�tsbedarfBerechnen(e51,5) + Kapazit�tsbedarfBerechnen(e56,6) + Kapazit�tsbedarfBerechnen(e31,6) );
		arbeitszeiten[3] = ( Kapazit�tsbedarfBerechnen(p1,6) + Kapazit�tsbedarfBerechnen(p2,7) + Kapazit�tsbedarfBerechnen(p3,7) );
		arbeitszeiten[4] = 0;
		arbeitszeiten[5] = ( Kapazit�tsbedarfBerechnen(e16,2) + Kapazit�tsbedarfBerechnen(e18,3) + Kapazit�tsbedarfBerechnen(e19,3) + Kapazit�tsbedarfBerechnen(e20,3) );
		arbeitszeiten[6] = ( Kapazit�tsbedarfBerechnen(e10,2) + Kapazit�tsbedarfBerechnen(e11,2) + Kapazit�tsbedarfBerechnen(e12,2) + Kapazit�tsbedarfBerechnen(e13,2) + Kapazit�tsbedarfBerechnen(e14,2) + Kapazit�tsbedarfBerechnen(e15,2) + Kapazit�tsbedarfBerechnen(e18,2) + Kapazit�tsbedarfBerechnen(e19,2) + Kapazit�tsbedarfBerechnen(e20,2) + Kapazit�tsbedarfBerechnen(e26,2) );
		arbeitszeiten[7] = ( Kapazit�tsbedarfBerechnen(e10,1) + Kapazit�tsbedarfBerechnen(e11,2) + Kapazit�tsbedarfBerechnen(e12,2) + Kapazit�tsbedarfBerechnen(e13,1) + Kapazit�tsbedarfBerechnen(e14,2) + Kapazit�tsbedarfBerechnen(e15,2) + Kapazit�tsbedarfBerechnen(e18,3) + Kapazit�tsbedarfBerechnen(e19,3) + Kapazit�tsbedarfBerechnen(e20,3) );
		arbeitszeiten[8] = ( Kapazit�tsbedarfBerechnen(e10,3) + Kapazit�tsbedarfBerechnen(e11,3) + Kapazit�tsbedarfBerechnen(e12,3) + Kapazit�tsbedarfBerechnen(e13,3) + Kapazit�tsbedarfBerechnen(e14,3) + Kapazit�tsbedarfBerechnen(e15,3) + Kapazit�tsbedarfBerechnen(e18,2) + Kapazit�tsbedarfBerechnen(e19,2) + Kapazit�tsbedarfBerechnen(e20,2) );
		arbeitszeiten[9] = ( Kapazit�tsbedarfBerechnen(e4,5) + Kapazit�tsbedarfBerechnen(e5,4) + Kapazit�tsbedarfBerechnen(e6,4) + Kapazit�tsbedarfBerechnen(e7,5) + Kapazit�tsbedarfBerechnen(e8,4) + Kapazit�tsbedarfBerechnen(e9,4) );
		arbeitszeiten[10] = ( Kapazit�tsbedarfBerechnen(e4,3) + Kapazit�tsbedarfBerechnen(e5,3) + Kapazit�tsbedarfBerechnen(e6,3) + Kapazit�tsbedarfBerechnen(e7,3) + Kapazit�tsbedarfBerechnen(e8,3) + Kapazit�tsbedarfBerechnen(e9,3) );
		arbeitszeiten[11] = ( Kapazit�tsbedarfBerechnen(e10,3) + Kapazit�tsbedarfBerechnen(e11,3) + Kapazit�tsbedarfBerechnen(e12,3) + Kapazit�tsbedarfBerechnen(e13,3) + Kapazit�tsbedarfBerechnen(e14,3) + Kapazit�tsbedarfBerechnen(e15,3) );
		arbeitszeiten[12] = ( Kapazit�tsbedarfBerechnen(e10,2) + Kapazit�tsbedarfBerechnen(e11,2) + Kapazit�tsbedarfBerechnen(e12,2) + Kapazit�tsbedarfBerechnen(e13,2) + Kapazit�tsbedarfBerechnen(e14,2) + Kapazit�tsbedarfBerechnen(e15,2) );
		arbeitszeiten[13] = ( Kapazit�tsbedarfBerechnen(e16,3) );
		arbeitszeiten[14] = ( Kapazit�tsbedarfBerechnen(e17,3) + Kapazit�tsbedarfBerechnen(e26,3) );
		
	}
	
	public int Kapazit�tsbedarfBerechnen (int auftragsmenge, int faktor)
	{
		return auftragsmenge*faktor;
	}
	
}
