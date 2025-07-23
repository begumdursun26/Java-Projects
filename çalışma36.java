package çalışıyorum;
import java.util.Scanner;
public class çalışma36 {

	public static void main(String[] args) {
		
	//klavyeden girilen n sayısına göre aşağıda belirtilen deseni ekrana yazdıran programı yazınız.(n=5)
		
		//*****
		//****
		//***
		//**
		//*
        int n,k,i;
        Scanner reader=new Scanner(System.in);
        System.out.println("klavyeden bir n sayısı giriniz");
        n=reader.nextInt();
        for(i=n;i>=1;i--) {
        	for(k=1;k<=i;k++)
        		System.out.print("*");
        	System.out.println(" ");
        	
        }
       
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("klavyeden bir a sayı giriniz");
        a=scanner.nextInt();
        for(b=a;b>=1;b--) {
        	for(c=1;c<=b;c++)
        		System.out.print("*");
        	System.out.println(" ");
        }
        
  
	}

}
