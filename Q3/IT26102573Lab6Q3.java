import java.util.Scanner;

public class IT26102573Lab6Q3 {

    public static void main(String[] args) {
        int sqrSum = 0;
        int numOfNumbers = 0;
        int InputNumber;

        Scanner Input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            InputNumber = Input.nextInt();

            if (InputNumber >= 0) {
                numOfNumbers++;
                sqrSum = sqrSum + InputNumber * InputNumber;
            } else if (InputNumber != -99) {
                System.out.println("Please enter a positive integer or -99 to terminate");
            }

        } while (InputNumber != -99);

        if (numOfNumbers > 0) {
            double rms = Math.sqrt((double) sqrSum / numOfNumbers);
            System.out.print("Root Mean Square is: " + rms);
        } else {
            
        }
    }
}