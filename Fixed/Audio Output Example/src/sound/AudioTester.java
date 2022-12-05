package sound;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioTester {

	public static void main(String[] args) 
	{
		playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\locked_door.wav",1700);
		System.out.println("done");
		// playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\Door_open_close.wav",6000);
		// System.out.println("done");
		// try {
		// 	Runtime.getRuntime().exec("cls");
		// } catch (IOException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }
		// playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\book.wav",6000);
		// System.out.println("done");
		// playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\keys.wav",6000);
		// System.out.println("done");
		// playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\knife.wav",6000);
		// System.out.println("done");
		// playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\locked_door.wav",6000);
		// System.out.println("done");
	}
	
	public static void playSound(String path, int ticks) {
	    if (path.isEmpty()) { return; }
	    try {
	        Clip soundClip = AudioSystem.getClip();
	        BufferedInputStream bufferedStream = new BufferedInputStream(new FileInputStream(path));
	        AudioInputStream inputStream = AudioSystem.getAudioInputStream(bufferedStream);
	        soundClip.open(inputStream);
	        soundClip.start();
	        Thread.sleep(ticks);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
