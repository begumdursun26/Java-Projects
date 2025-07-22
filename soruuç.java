package temelproblemler;
import java.util.Scanner;
public class soruuç {

	public static void main(String[] args) {
		
		//kullanıcıdan alınan 3 sayının en büyüğünü bulan program
		
		Scanner reader=new Scanner(System.in);
		int sayi1,sayi2,sayi3;
		System.out.println("1. sayıyı giriniz");
		sayi1=reader.nextInt();
		System.out.println("2. sayıyı giriniz");
		sayi2=reader.nextInt();
		System.out.println("3. sayıyı giriniz");
		sayi3=reader.nextInt();
		
		if(sayi1>sayi2 && sayi1>sayi3) 
			System.out.println("en büyük sayı="+sayi1);
		else if(sayi2>sayi1 && sayi2>sayi3)
			System.out.println("en büyük sayı="+sayi2);
		else if(sayi3>sayi1 && sayi3>sayi2)
			System.out.println("en büyük sayı="+sayi3);


	}

}
