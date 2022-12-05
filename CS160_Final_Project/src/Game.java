import java.util.Scanner;

public class Game {

	Character character;
	SoundPlayer soundPlayer;
	Rooms rooms;
	Scanner scnr;
	GameTools gameTools;
	
	public Game(SoundPlayer soundPlayer) {
		this.scnr = new Scanner(System.in);
		this.character = new Character(scnr);
		this.gameTools = new GameTools(character.luck);
		this.rooms = new Rooms(scnr, soundPlayer);
		scnr.close(); //DELETE ME DELETE ME DELETE ME DELETE ME
	}
	
	public void start() {
		
	}
	
	public void end() {
		
	}
}
