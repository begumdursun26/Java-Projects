package problemler;
import java.util.Scanner;
public class firmapaketsecimi {

	public static void main(String[] args) {
		
		// bir firma 2 adet servis paketi sunuyor ve herhangi bir paketi alabilmek için müşterinin bütçesinin en az 1500 TL 
		//olması gerekiyor. Müşterinin bütçesi 1500 ile 2500 TL arasında A pakedini, 2500 TL ce daha fazla ise hem daha düşük
	    //tutarda A pakedini hem de Bpakedini alabiliyor.
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bütçenizi giriniz");
		int butce=scanner.nextInt();
		if(butce<1500) {
			if(butce>=1500 && butce<=2500)
				System.out.println("A pakedini alabilirsiniz");
			else if(butce>2500)
				System.out.println("Hem A pakedini hem B pakedini alabilirsiniz");
	}
		else {
			System.out.print("yetersiz bakiye.En az 1500TL niz olmalı");
		
		
		
		
			
		}}}
		
		
		
		

	


