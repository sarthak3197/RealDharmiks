import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SameLineInput {

	int sizeandleap[]=new int[2];
    List<Integer> game=new ArrayList<Integer>();
	public void operation() 
	{
      @SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
		String x,y ;
      x=scanner.nextLine();
      y=scanner.nextLine();
      String[] a=x.split("\\s");
      String[] b=y.split("\\s");
      
      for(int i=0;i<2;i++)
    	  sizeandleap[i]=Integer.parseInt(a[i]);
    	  
      for(int i=0;i<((y.length()/2)+1);i++)
    	  game.add(Integer.parseInt(b[i]));
      
	}
	public int[] getSizeandleap() {
		return sizeandleap;
	}
	public List<Integer> getGame() {
		return game;
	}

}
