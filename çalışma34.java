package çalışıyorum;
import java.util.Scanner;
public class çalışma34 {

	public static void main(String[] args) {
		
		//klavyeden girilen n sayısına göre aşağıda belirtilen deseni ekrana yazdıran programı yazınız.(n=5)
		
		//*****
		//****
		//***
		//**
		//*
		
		int i,k,n;
		Scanner reader=new Scanner(System.in);
		System.out.println("klavyeden bir n sayısı giriniz");
		n=reader.nextInt();
		for(i=n;i>=1;i--) {
			for(k=1;k<=i;k++)
					System.out.print("*");
			System.out.println(" ");
		}
		
		
		
	}

}
