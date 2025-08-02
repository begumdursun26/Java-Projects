package ödev;

public class ödev8 {

	public static void main(String[] args) {
		
		// 4x3 lük bir matris tanımlayınız ve bu matrisin tüm elemanlarına 8 rakamını atayınız:
		
		int a[][]=new int[5][4];
				for(int i=0;i<5;i++) 
					for(int k=0;k<4;k++) 
						a[i][k]=4;
						for(int i=0;i<5;i++) {
						for(int k=0;k<4;k++) 
						System.out.print(a[i][k]);
						System.out.println();
					
				}

	}

}
