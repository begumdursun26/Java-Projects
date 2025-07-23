package çalışıyorum;

public class çalışma24 {

	public static void main(String[] args) {
		
		// aşağıda verilen matristeki sayıların toplamını ve ortalamasını ekrana yazdıran programı yazınız:
	    // int a[][]={{5,2,10},{15,20,25},{8,3,9},{60,5,12}}

		
		 int a[][]={{5,2,10},{15,20,25},{8,3,9},{60,5,12}};
		 int toplama=0,ort,satır=4,sutun=3,i,k; //hepsini neden tanımlamak zorundayım?
		 for(i=0;i<satır;i++) {
			 for(k=0;k<sutun;k++) {
				 toplama=toplama+a[i][k];
			 }}
		 ort=toplama/(satır*sutun);
		 System.out.println("toplam="+toplama);
		 System.out.println("ortalama="+ort);
		 
	}

}
