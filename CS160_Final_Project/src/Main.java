
public class Main 
{

	public static void main(String[] args) 
	{
		Character character = new Character();
		Rooms room = new Rooms();
		
		//Initializes character
		character.callAll();
		//Begins game
		room.roomCaller();

	}

}