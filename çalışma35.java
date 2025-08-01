package çalışıyorum;
import java.util.Scanner;
public class çalışma35 {

	public static void main(String[] args) {
	   
		//klavyeden girilen n sayısına göre aşağıda belirtilen deseni ekrana yazdıran programı yazınız.(n=5)
			//*
			//**
			//***
			//****
		    //*****
		
	     int i,k,n;
	     Scanner reader=new Scanner(System.in);
	     System.out.println("klavyeden bir n sayısı giriniz");
	     n=reader.nextInt();
	     for(i=1;i<=n;i++) {
	    	 for(k=1;k<=i;k++)
	    		 System.out.println("*");
	    	 System.out.print(" ");
	     }
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("klavyeden bir a sayı giriniz");
        a=scanner.nextInt();
        for(b=1;b<=a;b++) {
        	for(c=1;c<=b;b++)
       		 System.out.println("*");
	    	 System.out.print(" ");
        }
	}

}
