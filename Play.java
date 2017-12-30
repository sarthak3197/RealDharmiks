import java.io.File;

import jaco.mp3.player.MP3Player;

public class Play {

	public static void main(String[] args) throws InterruptedException {
		File file = new File("C:\\Users\\Shivangi\\Desktop\\Humsafar.mp3");
		MP3Player mp3 = new MP3Player(file);
		mp3.play();
		System.out.println("Main is about to sleep");
		Thread.sleep(30000);		
		System.out.println("Main woke up");
		
	}

}
