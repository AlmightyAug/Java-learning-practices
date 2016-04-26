import java.util.Scanner;

public class LearningSite5 {
	public static void main(String args[]){
		Scanner beef = new Scanner(System.in);
		double salmon,tuna,pork;
		
		System.out.println("Enter first number: ");
		salmon = beef.nextDouble();
		
		System.out.println("Enter second number: ");
		tuna = beef.nextDouble();
		
		pork = salmon + tuna;
		System.out.println(pork);
	}
}
