import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GameTools {

	private Integer luck;
	
	public GameTools(Integer luck) {
		this.luck = luck;
	}
	
	public Boolean chance() {
		Random rand = new Random();
		int upperBound = 30 - this.luck;
		int randomNumber = rand.nextInt(upperBound) - this.luck;
		if (randomNumber < 1) {
			return true;
		}
		return false;
	}
	
	public void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
