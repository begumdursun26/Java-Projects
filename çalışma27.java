package çalışıyorum;

public class çalışma27 {

	public static void main(String[] args) {
		
		
		
		
		// //dizideki tek sayıları ve tek sayıların adedini, toplamını ve ortalamasını ekrana yazdıran program:
		
		int teksayıadedi=0, toplam=0, ortalama=0;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int b=0;b<10;b++) {
			if(a[b]%2==1) {
				System.out.println(a[b]);
				teksayıadedi=teksayıadedi+1;
				toplam=toplam+a[b];
				ortalama=toplam/teksayıadedi;
			}}
				System.out.println("toplam="+toplam);
				System.out.println("tek sayı adedi="+teksayıadedi);
				System.out.println("ortalama="+ortalama);
				
				//çift
				
				int ciftsayiadedi=0,toplama=0,ort=0;
				int c[]= {11,12,13,14,15,16,17,18};
				for(int g=0;g<8;g++) {
					if(c[g]%2==0) {
						System.out.println(c[g]);
						ciftsayiadedi=ciftsayiadedi+1;
						toplama=toplama+c[g];
						ortalama=toplama/ciftsayiadedi;
					}}
						System.out.println("toplama="+toplam);
						System.out.println("çift sayı adedi="+ciftsayiadedi);
						System.out.println("ortalama="+ort);
						
			
	}}
