package de.hska.ibsys.help;

public class Workplace {
	public static int getProcessingTime(int wN, int pN){
		if(wN == 1){
			return 6;
		}
		else if(wN == 2){
			return 5;
		}
		else if(wN == 3){
			if(pN == 51){
				return 5;
			}
			else{
				return 6;
			}
		}
		else if(wN == 4){
			if(pN == 1){
				return 6;
			}
			else{
				return 7;
			}
		}
		else if(wN == 6){
			if(pN == 16){
				return 2;
			}
			else{
				return 3;
			}
		}
		else if(wN == 7){
			return 2;
		}
		else if(wN == 8){
			if(pN == 10 || pN == 13){
				return 1;
			}
			else if(pN == 11 || pN == 12 || pN == 14 || pN == 15){
				return 2;
			}
			else{
				return 3;
			}
		}
		else if(wN == 9){
			if(pN == 18 || pN == 19 || pN == 20){
				return 2;
			}
			else{
				return 3;
			}
		}
		else if(wN == 10){
			return 4;
		}
		else if(wN == 11){
			return 3;
		}
		else if(wN == 12){
			return 3;
		}
		else if(wN == 13){
			return 2;
		}
		else if(wN == 14){
			return 3;
		}
		else if(wN == 15){
			return 3;
		}
		else{
			return 0;
		}
	}
	
	public static int getToolingTime(int wN, int pN){
		if(wN == 1){
			return 20;
		}
		else if(wN == 2){
			if(pN == 30){
				return 20;
			}
			else{
				return 30;
			}
		}
		else if(wN == 3){
			return 20;
		}
		else if(wN == 4){
			if(pN == 2){
				return 20;
			}
			else{
				return 30;
			}
		}
		else if(wN == 6){
			return 15;
		}
		else if(wN == 7){
			if(pN == 26){
				return 30;
			}
			else{
				return 20;
			}
		}
		else if(wN == 8){
			if(pN == 10 || pN == 11 || pN == 12 || pN == 13 || pN == 14 || pN == 15){
				return 15;
			}
			else if(pN == 19){
				return 25;
			}
			else{
				return 20;
			}
		}
		else if(wN == 9){
			if(pN == 19){
				return 20;
			}
			else{
				return 15;
			}
		}
		else if(wN == 10){
			return 20;
		}
		else if(wN == 11){
			if(pN == 4 || pN == 5){
				return 10;
			}
			else {
				return 20;
			}
		}
		else if(wN == 12){
			return 0;
		}
		else if(wN == 13){
			return 0;
		}
		else if(wN == 14){
			return 0;
		}
		else if(wN == 15){
			return 15;
		}
		else{
			return 0;
		}
	}
}
