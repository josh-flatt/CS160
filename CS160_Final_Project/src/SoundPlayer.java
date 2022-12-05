import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.HashMap;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public final class SoundPlayer {

	private HashMap<String, Integer> waits = new HashMap<>(); // Generic sound name, wait time
	private HashMap<String, String> paths = new HashMap<>();  // Generic sound name, path
	
	public SoundPlayer() {
		// Book
		waits.put("Book", 2000);
		paths.put("Book", "C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\book.wav");
		
		// Door Opening and Closing
		waits.put("DoorCycle", 3500);
		paths.put("DoorCycle", "C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav");

		// Footsteps
		waits.put("Footsteps", 2500);
		paths.put("Footsteps", "C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\footsteps.wav");
		
		// Door Unlocking
		waits.put("DoorUnlock", 5500);
		paths.put("DoorUnlock", "C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\key_door_unlock.wav");
		
		// Door Locked
		waits.put("DoorLocked", 1700);
		paths.put("DoorLocked", "locked_door.wav");
		
		// Keys
		waits.put("Keys", 2500);
		paths.put("Keys", "C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\keys.wav");
		
		// Knife
		waits.put("Knife", 2500);
		paths.put("Knife", "C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\knife.wav");
	}
	
	public void playSound(String genericSoundName) {
		Integer waitTime = waits.get(genericSoundName);
		String path = paths.get(genericSoundName);
		
		if (paths.containsKey(genericSoundName)) { return; }
		try {
			Clip sound = AudioSystem.getClip();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(bufferedInputStream);
			sound.open(inputStream);
			sound.start();
			Thread.sleep(waitTime);
		}
		catch (Exception e) { e.printStackTrace(); }
	}
}
