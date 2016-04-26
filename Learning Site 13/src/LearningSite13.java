import java.util.Scanner;

public class LearningSite13 {
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		LearningSite13a LearningSite13aObject = new LearningSite13a ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		LearningSite13a.simpleMessage(name);
		
	}
}