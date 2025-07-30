package temelproblemler;

import java.util.Scanner;

public class sorusekiz {

	public static void main(String[] args) {
		//kullanıcının istediği aralıkta 7'ye tam bölünen sayıları bulan programı yazınız.
		
        int i,n,m;
        Scanner reader=new Scanner(System.in);
        System.out.println("başlangıç sayısını giriniz");
        n=reader.nextInt();
        System.out.println("bitiş sayısını giriniz");
        m=reader.nextInt();
        for(i=n;i<m;i++) {
        	if(i%7==0)
        		System.out.print(i + "  ");
        }
        
	}

}
