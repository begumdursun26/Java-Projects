package temelproblemler;

public class sorualtı {

	public static void main(String[] args) {
		// 1'den 100'e  kadar olan sayıların toplamını bulunuz?
		
		int i,toplam=0;		
		for(i=1;i<100;i++) {
			//toplam=toplam+i; (aşağıdakiyle ayı şey)
			toplam += i; 
		}
			System.out.println("1'den 100'e  kadar olan sayıların toplamı="+toplam);

	}

}
