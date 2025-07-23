package çalışıyorum;

import java.util.Scanner;

public class çalışma8 {

	public static void main(String[] args) {
		
		// int b[]={23,24,27,98,67,56,45,34,35,38,31,32,12}; 1<=n<=10 dizinin ilk n adet elemanını ekrana yazdıran program:

		int b[]= {23,24,27,98,67,56,45,34,35,38,31,32,12};
		Scanner reader=new Scanner(System.in);
		System.out.println("1 ile 13 arasında bir sayı giriniz");
		int c=reader.nextInt();
		if(c>=1 && c<=13) {
			for(int m=0;m<c;m++) {
			System.out.println(m+1 +".sayı" +b[m]);
		}
	}
		else {
			System.out.println("geçerli bir sayı giriniz:");
		
	}

}}
