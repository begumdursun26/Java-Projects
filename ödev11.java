package ödev;

public class ödev11 {

	public static void main(String[] args) {
		
		// aşağıda verilen matristeki sayıların toplamını ve ortalamasını ekrana yazdıran programı yazınız:
	    // int a[][]={{6,7,18},{16,24,25},{1,3,4},{67,5,13}}

		
		int a[][]={{6,7,18},{16,24,25},{1,3,4},{67,5,13}};
		 int toplama=0,ort,satır=4,sutun=3,i,k; 
		 for(i=0;i<satır;i++) {
			 for(k=0;k<sutun;k++) {
				 toplama=toplama+a[i][k];
			 }}
		 ort=toplama/(satır*sutun);
		 System.out.println("toplam="+toplama);
		 System.out.println("ortalama="+ort);
		 

	}

}
