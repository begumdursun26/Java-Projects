package çalışıyorum;

import java.util.Scanner;
public class çalışma9 {
	
	public static void main(String[] args) {

		
		// int a[]={23,24,27,98,67,56,45,34,35,38,31,32,12}
		//klavyeden s ve n sayıları giriliyor dizinin s nolu elemanından başlayarak n adet elemanı ekrana yazdıran program:
		
		int a[]={23,24,27,98,67,56,45,34,35,38,31,32,12};
		Scanner reader=new Scanner(System.in);
		System.out.println("s giriniz");
		int s=reader.nextInt();
		System.out.println("n giriniz");
		int n=reader.nextInt();
		for(int i=s;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
