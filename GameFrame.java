import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(GWIDTH, GHEIGHT);
		setTitle(TITLE);
		setLocationRelativeTo(null);
		setVisible(true);
		Board board = new Board();
		add(board);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameFrame frame = new GameFrame();

	}

}
