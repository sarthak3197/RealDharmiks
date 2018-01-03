import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePuzzle {
	int n;
	int leap;
	static int q;
    List<Integer> game=new ArrayList<Integer>();
	GamePuzzle(int n,int leap)
	{
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		this.n=n;
		this.leap=leap;
		for(int i=0;i<n;i++)
			game.add(scanner.nextInt()); 
	}

    public Boolean gamealgo()
    {
    	for(int i=0;i<n;i++)
    	{
    	
    	label:  if(game.get(i)==0)
    			{
    			 if((i+leap)<n-1)
    			 {
    			   if(game.get(i+leap)==0)
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
  
    				  for(int j=1;game.get(i+leap-j)==0;j++)
    				   {
    					  if(game.get(i+leap-j)==0)
    	    				  {
    	    				   i=i+leap-j;
    	    				   break label;
    	    				  }
    				   }
    				  
    				  
    				  return false;    
    				
    		    }		
    	}
    	return true;
    
    }
}
