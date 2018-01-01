import java.util.ArrayList;
import java.util.Scanner;

public class TestGamePuzzle {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		GamePuzzle.q=scanner.nextInt();
        SameLineInput read=new SameLineInput();
		ArrayList<GamePuzzle> l=new ArrayList<GamePuzzle>();
		for(int i=0;i<GamePuzzle.q;i++)
		{
			read.operation();
			GamePuzzle game=new GamePuzzle(read.getSizeandleap(),read.getGame());
			l.add(game);

		}
		for(int i=0;i<GamePuzzle.q;i++)
		{
          System.out.println(((GamePuzzle) l.get(i)).gamealgo());
		}
       scanner.close();      
	}

}
