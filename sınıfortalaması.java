package problemler;
import java.util.Scanner;
public class sınıfortalaması {

	public static void main(String[] args) {
		
		//Bir öğretmenin, bir sınıftaki öğrencilerin sınav notlarını alıp sınıfın genel ortalamasını
		//hesapladığını düşünelim. Bu senaryoda, kullanıcıdan öğrencilerin notlarını girmesi istenir ve for döngüsü 
		//kullanılarak bu notların toplamı ve ortalaması hesaplanır.
		
        Scanner reader=new Scanner(System.in);
        //Sınıftaki öğrenci sayısını sor
        System.out.print("Sınıftaki öğrenci sayısını girin");
        int ogrencisayısı=reader.nextInt();
        //notların toplamını saklamak için değişken tanımla
        double toplamnot=0;
        //for döngüsü ile notları topla
        for(int i=1;i<=ogrencisayısı;i++) {
        System.out.print(i +".ögrencinin notunu girin");
        double not=reader.nextDouble();
        toplamnot+=not;
        double ortalama=toplamnot/ogrencisayısı;
        System.out.println("sınıfın not ortalaması");
        for(int i=1;i<=ogrencisayısı;i++) {
        	 System.out.print(i +".ögrencinin notunu tekrar girin");
        	 double not=reader.nextDouble();
        	 if(not>=50) {
        		 System.out.println(i+".öğrenci geçti");
        	 }
        	 else {
        		 System.out.println(i+".öğrenci kaldı");
        	 }
        	 }
        }
        
        
        
	}

}
