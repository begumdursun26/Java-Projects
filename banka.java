package problemler;
import java.util.*;
public class banka {

	public static void main(String[] args) {
		
		//kullanıcı bir ATM ye giriş yapmış gibi işlem yapabilir. kullanıcıdan işlem alınır ve seçilen işleme
		//göre farklı işlem seçimi alınır ve seçilen işleme göre farklı işlem gerçekleştirir.
		//örn:bakiye sorgulama,para çekme,para yatırma...

		//başlangıç bakiyesi
		
		
		int bakiye=1000;
		System.out.println("atmye hoşgeldiniz:");
		System.out.println("1.bakiye sorgulama");
		System.out.println("2.para çekme");
		System.out.println("3.para yatırma");
		System.out.println("4.çıkış");
		System.out.println("lütfen yapmak istediğiniz işlemi seçiniz(1-4):");
		Scanner reader=new Scanner(System.in);
		int secim=reader.nextInt();
		
		//karar yapıları ile işlemleri belirleme
		
		switch(secim) {
		case 1:
			//bakiye sorgulama
			System.out.println("mevcut bakiyeniz:"+bakiye+"TL");
			break;
		case 2:
			//para çekme
			System.out.println("çekmek istediğiniz tutarı giriniz:");
			int cekilecektutar=reader.nextInt();
			if(cekilecektutar<=0) {
				System.out.println("geçersiz bir tutar giridiniz:");
			}
				else {
					bakiye-=cekilecektutar; //-= ne demek?
					System.out.println("başarıyla"+ cekilecektutar+ "TL çektiniz.");
					System.out.println("kalan bakiyeniz"+bakiye+ "TL");
				}
				break;
				//para yatırma
				case 3:
					System.out.println("yatıracağınız istediğiniz tutarı giriniz");
					int yatırılacaktutar=reader.nextInt();
					if(yatırılacaktutar<=0) {
						System.out.println("geçersiz bir tutar giridiniz");
					}
					else {
						bakiye+=yatırılacaktutar;
						System.out.println("başarıyla="+yatırılacaktutar+ "TL yatırdınız");
						System.out.println("güncel bakiyeniz:"+bakiye+ "TL");
					}
					break;
					// çıkış
				case 4:
					System.out.println("çıkış yapılıyor. iyi günler.");
					break;
					default:
						System.out.println("geçersiz bir seçim yaptınız. tekrar deneyiniz");
						
						
					}
					
					
					
				}
			}
		
	


