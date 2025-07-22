package temelproblemler;

import java.util.Scanner;

public class soruiki {

	public static void main(String[] args) {
		
		//kullanıcıdan iki sayı alarak bunların toplamını ve
		//ortalamasını ekrana yazdıran program
		
		int toplama=0,ortalama=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("ekrana 1.sayıyı giriniz");
		int sayı1=reader.nextInt();
		System.out.println("ekrana 2.sayısı giriniz");
		int sayı2=reader.nextInt();
		 toplama=sayı1+sayı2;
		 ortalama=toplama/2;
		 System.out.println("toplama="+toplama);
		 System.out.println("ortalama="+ortalama);
		 
		
		

	}

}
