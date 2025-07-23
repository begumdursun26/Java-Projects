package çalışıyorum;
import java.util.*;
public class çalışma22 {

	public static void main(String[] args) {
		
		// 4x3 lük bir matris tanımlayınız ve bu matrise aşağıdaki sayıları atayınız:
		 
		// 1  2  3
		// 1  2  3
		// 1  2  3
		// 1  2  3

		
		int sayac=0;
		int a[][]=new int[4][3];
		for(int i=0;i<4;i++) {
			sayac=0;
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
