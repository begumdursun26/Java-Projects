package temelproblemler;

import java.util.Scanner;

public class sorudört {

	public static void main(String[] args) {
		
		// ikinci dereceden denklemin diskrimant ile çözümü
		//ikinci dereceden ax^2+bx+c =0 dekleminin diskriminat
		//çözümünü yapınız. Kullanıcıdan a,b ve c değerlerini
		//alarak deltayı hesaplayınız.
		
		int a,b,c,delta;
		float kok1,kok2;
		Scanner reader=new Scanner(System.in);
		
		System.out.println("a sayısını giriniz");
		a=reader.nextInt();
		
		System.out.println("b sayısını giriniz");
		b=reader.nextInt();
		
		System.out.println("c sayısını giriniz");
		c=reader.nextInt();
		
		delta=b*b-(4*a*c);
		 
		if(delta>0) {
			System.out.println("denklemin 2 kökü vardır");
			kok1= (float)(-b-Math.sqrt(delta))/2*a;
			kok2= (float)(-b-Math.sqrt(delta))/2*a;
			System.out.println("kök 1=" +kok1);
			System.out.println("kök 2=" +kok2);
		}
			
			else if(delta==0) {
				System.out.println("denklemin çakışık kökü vardır");
				kok1= (float)(-b)/2*a;
				System.out.println("kökler=" +kok1);
			}
			else 
				System.out.println("denklemin kökü yoktur");
		
				
			}
			
		

	}


