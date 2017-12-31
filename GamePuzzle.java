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
		this.n=n;
		this.leap=leap;
	    creategame(n,leap);
	}
	public void creategame(int n,int leap)
	{
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter game");
		for(int i=0;i<n;i++)
		{
         game.add(scanner.nextInt());			
		}
	}
    public Boolean gamealgo()
    {
    	for(int i=0;i<n;i++)
    	{
    		if(game.get(i)==0)
    			continue;
    		else
    		{
    				if((i+leap)>n)
    				return true;
    				else
    				return false;    
    		}		
    	}
    	return true;
    }
}
