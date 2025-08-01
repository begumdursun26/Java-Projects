package çalışıyorum;

public class çalışma21 {

	public static void main(String[] args) {
		
		
		// 4x3 lük bir matris tanımlayınız ve bu matrisin tüm elemanlarına 8 rakamını atayınız:
		
		int a[][]=new int[4][3];
				for(int i=0;i<4;i++) 
					for(int k=0;k<3;k++) 
						a[i][k]=8;
						for(int i=0;i<4;i++) {
						for(int k=0;k<3;k++) 
						System.out.print(a[i][k]);
						System.out.println();
					
				}

	}

}
