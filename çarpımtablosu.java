package problemler;

public class çarpımtablosu {

	public static void main(String[] args) {
		
		//bir for döngüsü kullanarak 1den 10a kadar çarpım tablosu oluşturunuz.
		
		System.out.println("çarpım tablosu");
		//dıştaki for döngüsü 1 den 10 a kadar bir sayı seçer
		for(int i;i<=10;i++) {
			//içteki for döngüsü, bu sayıyı 1 den 10 akadar başka bir sayıile çarpar
			for(int j=1;j<=10;j++) {
				System.out.print(+"x"+j+"="+(i*j)+"\t");
			}
				System.out.println();
		}

	}

}
