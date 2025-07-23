package çalışıyorum;

import java.util.*;

public class çalışma19 {

	public static void main(String[] args) {
		
		//rastgele üretilen 1000 adet sayıda kaç tane tek ve çift sayı olduğunu bulan programı yazınız:
		
		int ciftsayıadedi=0;
		int teksayıadedi=0;
		
		Random rnd= new Random();
		for(int i=0;i<1000;i++) {
		int n = rnd.nextInt(10);
		if(n%2==0) {
			ciftsayıadedi++;
			}}
      System.out.println("çift sayıların adedi=" +ciftsayıadedi);
      teksayıadedi = 1000-ciftsayıadedi;
      System.out.println("tek sayı adedi=" +teksayıadedi);
}}
