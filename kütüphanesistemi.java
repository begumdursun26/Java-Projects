package problemler;

import java.util.Scanner;

public class kütüphanesistemi {

	public static void main(String[] args) {
		
		// bir kütüphane sistemi geliştirdiğimizi düşünelim.kullanıcı sisteme giriş yaptıktan sonra farklı
		//işlemler gerçekleştirebilir.
		//istenilenler:kitap ödünç alma,kitap iade etme,kitap sorgulama ve sistemden çıkış yapma.

		Scanner reader=new scanner(System.in);
		//Kütüphane kitap listesi
		String liste[]= {"sefiller","suc ve ceza","1984","kürk mantolu madonna","simyacı"};
		for( int b=0;b<liste.length;b++) 
			System.out.println(liste[b]);
		
		//ödünç alınan kitaplar listesi
		int ödüncalınanlar=reader.nextInt();
		System.out.println("kütüphane sistemine hoşgeldiniz");
		System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
		
		
	}

}
