import java.util.Scanner;

public class Solution {
    public static boolean canWin(int leap,int n, int[] game)
    {
    	for(int i=0;i<n;i++)
    	{
    	
    	label:  if(game[i]==0)
    			{
    			 if((i+leap)<n-1)
    			 {
    			   if(game[i+leap]==0)
    			  	i=i+leap-1;
    			 }
    			   else
    			   continue;
    			}    
    			
    			 else
    		    {
    			  i--;	
    			  if((i+leap)>(n-1))
    				return true;
  
    			if(i>0)	  
    			  {
    				for(int j=1;game[i+leap-j]==0;j++)
    			  
    				   {
    					  if(game[i+leap-j]==0)
    	    				  {
    	    				   i=i+leap-j;
    	    				   break label;
    	    				  }
    				   }
    			  }	  
    				  
    				  return false;    
    				
    		    }		
    	}
    	return true;
    
    }

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
           
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap,n, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
