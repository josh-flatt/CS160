
public class Main {
	
	public static void main(String[] args) {
		SoundPlayer soundPlayer = new SoundPlayer();
		Game game = new Game(soundPlayer);
		game.start();
	}
}
