package temelproblemler;
import java.util.*;
public class sorubeş {

	public static void main(String[] args) {
		
		// vize ve final notunu alarak ortalama puan hesaplayan ve 
		//geçme/kalma durumunu kontrol eden programı yazınız
		
		//vize notunun %40 ını, final notunun %60 ını alarak ortalama
		//notu hesaplayan,ortalama 50 den büyükse geçti ,küçükse
		// kaldı yazan programı yazınız
		
		int vize,fnal;
		float ortalama;
       Scanner reader=new Scanner(System.in);
       System.out.println("Vize notunuzu giriniz");
       vize=reader.nextInt();
       System.out.println("Final notunu giriniz");
       fnal=reader.nextInt();
       ortalama= (float) (vize*0.4 + fnal*0.6);
       System.out.println("ortalamanız=" +ortalama);
       if(ortalama>=50)
    	   System.out.println("Dersten geçti");
       else
    	   System.out.println("Dersten kaldı");
       
       

	}

}
