package çalışıyorum;

import java.util.Scanner;

public class çalışma30 {

	public static void main(String[] args) {
		
		
	// int a[]={4,8,3,1,18,9,21,20,5,17}; 1<=n<=10 dizinin ilk n adet elemanını ekrana yazdıran program:
		
		int a[]={4,8,3,1,18,9,21,20,5,17}; 
		Scanner reader=new Scanner(System.in);
		System.out.println("1 ile 10 arasında sayı giriniz:");
	    int n=reader.nextInt();
	    if(n<=1 && n<=10) 
	    for(int b=0;b<n;b++) {
	    	System.out.println(a[b]);
	    }
	  
	    else {
	    	System.out.println("geçerli bir sayı giriniz:");
	    }
	    	

	}

}
