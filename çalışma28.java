package çalışıyorum;

public class çalışma28 {

	public static void main(String[] args) {
		
		
		 //dizideki tek sayıları ve tek sayıların adedini, toplamını ve ortalamasını ekrana yazdıran program:

		
		
		int teksayiadedi=0, toplam=0, ortalama=0;
		int a[]= {1,2,3,4,5,6,7,8,9};
		for(int b=0;b<9;b++) {
			if(a[b]%2==1) {
				System.out.println(a[b]);
		
				teksayiadedi=teksayiadedi+1;
			    toplam= toplam+a[b];
				ortalama=toplam/teksayiadedi;
			}}
				System.out.println("tek sayı adedi="+teksayiadedi);
				System.out.println("toplma="+toplam);
				System.out.println("ortalama="+ortalama);
				
		
	
	}

}
