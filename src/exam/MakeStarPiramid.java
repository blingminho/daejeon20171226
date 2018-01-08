package exam;

public class MakeStarPiramid {

	public static void main(String[] args) {
		/*
		1번
		   *
		  ***
		 *****
		*******
		
		2번
		   *
		  ***
		 *****
		*******
		 *****
		  ***
		   *
		
		
		 */
		int yLength = 4;
		int xLength = 8;
		
		// 1번
		for (int i = 0, k = 0; i < yLength; i++, k++) {
			for (int j = 1; j < xLength; j++) {
				if (xLength/2 - k <= j && j <= xLength/2 + k) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("--------------------------------------");
		// 2번
		yLength = 7;
		xLength = 8;
		for (int i = 0, k = 0; i < yLength; i++) {
			for (int j = 1; j < xLength; j++) {
				if (xLength/2 - k <= j && j <= xLength/2 + k) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if(i >= yLength/2){
				k--;
			}else{
				k++;
			}
			System.out.println("");
		}

		
		
		
		
		
	}
}
