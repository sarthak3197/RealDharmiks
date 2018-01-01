import java.util.ArrayList;
import java.util.List;

public class GamePuzzle {
	int n;
	int leap;
	static int q;
    List<Integer> game=new ArrayList<Integer>();
	GamePuzzle(int sizeandleap[],List<Integer> game)
	{
		this.n=sizeandleap[0];
		this.leap=sizeandleap[1];
        this.game=game;
	}

    public Boolean gamealgo()
    {
    	for(int i=0;i<n;i++)
    	{
    		if(game.get(i)==0)
    			{
    			 if((i+leap)<n-1)
    			 {
    			 if(game.get(i+leap)==0)
    			  	i=i+leap-1;
    			 else
    				 continue;
    			}
    			}
    			 else
    		{
    			i--;	
    			if((i+leap)>(n-1))
    				return true;
    			if(game.get(i+leap)==0)
    				{
    				i++;
    				continue;
    				}
    			else
    				return false;    
    		}		
    	}
    	return true;
    }
}
