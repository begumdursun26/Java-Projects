package ödev;

public class ödev10 {

	public static void main(String[] args) {
		
		// 4x3 lük bir matris tanımlayınız ve bu matrise aşağıdaki sayıları atayınız:
		
		// 9 10 11
		// 12 13 14
		// 15 16 17
		// 18 19 20
	

		int sayac=8;
		int a[][]=new int[4][3];
		for(int i=0;i<4;i++) {
		for(int k=0;k<3;k++) {
			sayac=sayac+1;
			a[i][k]=sayac;
		}}
			for(int i=0;i<4;i++) {
				for(int k=0;k<3;k++) 
					System.out.print(a[i][k]+" ");
				System.out.println();
			
	}

	}

}
