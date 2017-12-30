package first;


import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter queries");
       int q=scanner.nextInt();
       int i;
       for(i=0;i<q;i++) {
    	   System.out.println("enter array size");
    	   int n = scanner.nextInt();
    	   System.out.println("enter leap");
    	   int leap = scanner.nextInt();
    	   int j;
    	   System.out.println("enter array");
    	   int[] Array = new int[n];
    	   for (j=0; j<n;j++) {
    		   Array[j]=scanner.nextInt();    		   
    	   }
       
    	   int position = -1;
    	   int k=0;
    	   
    		   while(k<n){
    	   if(position+1<=n && Array[position+1]==0)
    	   {
    		  position++; 
    	  }  
    		   
    	   else if ((position+leap)>n) {
    		   position=n;
    		   break;
    		   
    	   }
    	   else if (Array[position+leap]==0) {
    		  position=position + leap;
    		   }
    	   
    	   k++;
    		}
       	
    	   if(position == n-1 || position>=n)
    	   {
    		   System.out.println("you won");
    	   }
    	   else {
    		   System.out.println("you lose");
    	   }
       
       }
	
scanner.close();

}
}
