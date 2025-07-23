package çalışıyorum;

public class çalışma23 {

	public static void main(String[] args) {
		
		// 4x3 lük bir matris tanımlayınız ve bu matrise aşağıdaki sayıları atayınız:
		
		// 1  2  3
		// 4  5  6
		// 7  8  9
		// 10 11 12
	

		int sayac=0;
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

}}
