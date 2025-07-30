package temelproblemler;
import java.util.*;
public class soruyedi {

	public static void main(String[] args) {
		
		//YANLIŞLIK VAR
		
		//1'den n'ye  kadar olan tek sayıların toplamını bulunuz?
		// n sayısı kullanıcıdan alınacaktır
		
		int i,toplam,n;
		Scanner reader=new Scanner(System.in);
		System.out.println("bir n sayısı giriniz");
		n=reader.nextInt();
		toplam=0;
		for(i=1;i<n;n++) {
         if(i%2==1)
        	 toplam+=i;
		}
		System.out.println("1'den n'ye  kadar olan tek sayıların toplamı="+toplam);
		
	}

}
