package beep;

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
		/*playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\Door_open_close.wav",6000);
		System.out.println("done");
		try {
			Runtime.getRuntime().exec("cls");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\book.wav",6000);
		System.out.println("done");
		playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\keys.wav",6000);
		System.out.println("done");
		playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\knife.wav",6000);
		System.out.println("done");
		playSound("C:\\Users\\joshm\\eclipse-workspace\\STUPID AUDIO\\src\\beep\\locked_door.wav",6000);
		System.out.println("done");*/


	}
	
	public static void playSound(String url, int num) {
	    if (url.isEmpty())
	        return;
	    try {

	        Clip clip = AudioSystem.getClip();
	        BufferedInputStream x = new BufferedInputStream(new FileInputStream(url));
	        AudioInputStream inputStream = AudioSystem.getAudioInputStream(x);
	        clip.open(inputStream);
	        clip.start();
	        Thread.sleep(num);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
