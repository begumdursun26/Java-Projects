package çalışıyorum;

public class çalışma11 {

	public static void main(String[] args) {
		
		// dizinin en büyük elemanını ve bu elemanın indis numarasını gösteren program:
		
		int a[]= {4,8,3,1,18,9,21,20,5,17};
		int max = a[0];
		int sayı=0; //indis numarasını gösteren yeni bir değer ata
		for(int i=0;i<a.length;i++){
			if(max<a[i]) {
				max=a[i];
				sayı=i; // max değere burda oluştuğu için if in içerisinde yazıyoruz.
				}}
       System.out.println("en büyük eleman:"+max);
       System.out.println("indis numarası:"+sayı);

	}}
        
       
            
            