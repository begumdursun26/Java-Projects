package ödev;

public class ödev4 {

	public static void main(String[] args) {
		
		//int a[]={6,9,17,2,23,21,14} Dizideki tek sayıları ve tek sayıların adedini,toplamını ve ortalamasını 
	   //ekrana yazdıran program:
		
		int toplam=0,ortalama=0,teksayıadedi=0;
		int a[]={6,9,17,2,23,21,14};
		for(int i=0;i<7;i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]);
				teksayıadedi=teksayıadedi+1;
				toplam=toplam+a[i];
			}
		}
		ortalama=toplam/teksayıadedi;
		System.out.println("tek sayı adedi="+teksayıadedi);
		System.out.println("tek sayıların toplamı="+toplam);
		System.out.println("tek sayıların ortalaması="+ortalama);
		
			
			

	}

}
