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
    			   if(position == n-1 || position>=n) {
    				   break;
    			   }	   
           else if(position+1<=n && Array[position+1]==0)
    	   {
    		  position++;
    		 
    	  }  
           else if ((position+leap)>n) {
    		   position=n;
    		   break;
		   }
		   else if (Array[(position+1)+leap]==0) {
	    		  position=position + leap;
	    		 
		   }  
    	   k++;
    	   if ((position+leap)==1)
    	   {
    		   position--;
    		   k--;
    	   }
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
/*
	Scanner scanner = new Scanner(System.in);
    int i,n,leap,x=0,y=0;
    game(int n,int leap){
    	this.n=n;
    	this.leap = leap;
    	creategame();
    	
    }
		
		public void creategame(){
		// TODO Auto-generated method stub
			System.out.println("enter queries");
			 int q=scanner.nextInt();
       for(i=0;i<q;i++) {
    	   System.out.println("enter array size");
    	   n = scanner.nextInt();
    	   System.out.println("enter leap");
    	   leap = scanner.nextInt();
    	   int j;
    	   System.out.println("enter array");
    	   int[] Array = new int[n];
    	   for (j=0; j<n;j++) {
    		   Array[j]=scanner.nextInt();    		   
    	   }
       
       public void Forward() {
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
    		  x++;
    	   }
    	   else {
    		   y++;
    	   }
       }
       }
     // while(x>-1 || y>-1) {
      // if(x>0) {
    	   while(x>0) {
    		   System.out.println("yes");
    		   x--;
    	   }
       //}
        //if (y>0) {
    	   while(y>0) {
    		   System.out.println("no");
    		   y--;
    	//   }
    //   }
       }
	
scanner.close();

}
*/
}