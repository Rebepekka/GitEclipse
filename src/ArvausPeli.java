import java.util.Scanner;
public class ArvausPeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		
		String secretWord ="Kukka";
		String guess = "";
		int counter = 0;
		
		while(!guess.equals(secretWord))
		{
			System.out.println("Arvaa nimi:");
			guess = keyboardInput.nextLine();
			counter++;
			if(guess.equals("Loppu"))
			{
				System.out.println("Lopetit pelin.");
				System.out.println("Arvasit " + counter + " kertaa.");
				System.exit(0);
			}
		}
		System.out.println("Arvasit oikein!");
		System.out.println("Arvasit " + counter + " kertaa.");	
	}

}
