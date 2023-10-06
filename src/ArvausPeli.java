import java.util.Scanner;
public class ArvausPeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		
		String secretWord ="Kukka";
		String guess = "";
		
		while(!guess.equals(secretWord))
		{
			System.out.println("Arvaa nimi:");
			guess = keyboardInput.nextLine();
		}
				
		
		
		
	}

}
