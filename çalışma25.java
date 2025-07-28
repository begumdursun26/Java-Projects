package çalışıyorum;

public class çalışma25 {

	public static void main(String[] args) {
		
		// aşağıda verilen matriste en büyük elemanı bulan programı yazınız:
		 // int a[][]={{5,2,10},{15,20,25},{8,3,9},{60,5,12}}
		
		  int a[][]={{5,2,10},{15,20,25},{8,3,9},{60,5,12}};
		  int i,k,satır=4,sutun=0,max=a[0][0];
		  for(i=0;i<satır;i++);
		  for(k=0;k<sutun;k++);
		  if(a[i][k]>max)
			  max=a[i][k];
		  System.out.print("matristeki en büyük eleman="+max);

	}

}
