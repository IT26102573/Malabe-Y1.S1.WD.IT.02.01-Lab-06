import java.util.Scanner;

public class IT26102573Lab6Q2C{
	public static void main(String[]args)
	{
		int count = 1;
		int num;
		String numbers = " ";
		double sum = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers : ");
		
		while(count <= 10)
		{
			System.out.print("Enter number " + count + " : ");
			num = in.nextInt();
			count++;
			numbers = numbers + num + " ";
			sum += num;
		}
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.print(numbers);
		
		double avg = sum/count;
		
		System.out.println();
		System.out.println("Sum of the numbers : " + sum);
		System.out.println("Average of the numbers : " + avg);
	}
}