package çalışıyorum;

import java.util.Scanner;

public class çalışma15 {

	public static void main(String[] args) {
		
		// dizinin son n adet elemanını baştan sona yazan program:
		
		Scanner reader=new Scanner(System.in);
		System.out.println("klavyeden sayı giriniz:");
		int n=reader.nextInt();
		 int a[]={4,8,3,1,18,9,21,20,5,17};
		 for(int i=a.length-n;i<a.length;i++) {
			 System.out.println(a[i]);
			 
		 }
	}

}
