package çalışıyorum;

public class çalışma4 {

	public static void main(String[] args) {
		
		//dizideki tek sayıları ve tek sayıların adedini yazdıran program:
		
		int tekadedi=0;
		int a[]= {8,4,7,2,5};
		for(int i=0;i<5;i++) {
		if(a[i]%2==1){
			System.out.println(a[i]);
			tekadedi+=1;
			}}
        System.out.println("tek sayı adedi="+tekadedi);
        
      //dizideki tek sayıları ve tek sayıların adedini yazdıran program:
        
        int tekaded=0;
        int b[]= {2,6,47,8,9,83,5,82};
        for(int m=0;m<8;m++) {
        	if(b[m]%2==1) {
        		System.out.println(b[m]);
        	tekaded=tekaded+1;
        }}
        
       System.out.println("tek sayı adedi="+tekadedi);
	
       
       //dizideki çift sayıları ve çift sayıların adedini yazdıran program:
       
       int ciftadedi=0;
       int c[]={48,98,9,73,93,10,90};
       for(int n=0;n<7;n++) {
    	   if(c[n]%2==0) {
    		   System.out.println(c[n]);
    		   ciftadedi=ciftadedi+1;
    	 }}
       System.out.println("çift sayı adedi="+ciftadedi);
       
   	//dizideki tek sayıları ve tek sayıların adedini yazdıran program:
       
       int tkdd=0;
       int k[]= {1,2,3,4,5,6,7,8,9,10};
       for(int p=0;p<10;p++) {
    	   if(k[p]%2==1) {
    		   System.out.println(k[p]);
    		   tkdd=tkdd+1;
    		   }}
       System.out.println("tek sayı adedi="+tkdd);
       
     //dizideki çift sayıları ve çift sayıların adedini yazdıran program:
       
       int çftdd=0;
       int ü[]= {90,45,67,89,12,13,1,2,3,4,5,6,7,8};
       for(int y=0;y<14;y++) {
       if(ü[y]%2==0) {
    	   System.out.println(ü[y]);
    	   çftdd=çftdd+1;
    	   }}
       System.out.println("çift sayı adedi="+çftdd);
       
	}}

       
	
        
