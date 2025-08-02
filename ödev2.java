package ödev;

public class ödev2 {

	public static void main(String[] args) {
		

		//int a[]={6,10,4,9,17,2,23,21,5,13} Dizinin toplamını ve ortalamasını ekrana yazdıran program:
		
		
		int toplam=0,ortalama;
		int a[]={6,10,4,9,17,2,23,21,5,13};
		for(int i=0;i<10;i++) {
		toplam=toplam+a[i];
		}
		System.out.println("toplam="+toplam);
		ortalama=toplam/10;
		System.out.println("ortalama="+ortalama);
		

	}

}
