import java.util.ArrayList;
import java.util.Scanner;

public class TestGamePuzzle {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		GamePuzzle.q=scanner.nextInt();
		ArrayList<GamePuzzle> l=new ArrayList<GamePuzzle>();
		for(int i=0;i<GamePuzzle.q;i++)
		{
			GamePuzzle game=new GamePuzzle(scanner.nextInt(),scanner.nextInt());
			l.add(game);

		}
		for(int i=0;i<GamePuzzle.q;i++)
		{
          System.out.println(((GamePuzzle) l.get(i)).gamealgo());
		}
       scanner.close();      
	}
}
