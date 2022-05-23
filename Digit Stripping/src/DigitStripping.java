import java.util.Scanner;

public class DigitStripping
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What number do you want reversed?");
				int userNumber = userInput.nextInt();
				int reversedNumber = 0;
				int sum = 0;

				 while(userNumber > 0)
					 {
					 	reversedNumber = userNumber % 10;
					 	userNumber = userNumber / 10;
					 	sum += reversedNumber; 
					 }
				 
					System.out.print(sum);
			}
	}
