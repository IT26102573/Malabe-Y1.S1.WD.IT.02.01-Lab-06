import java.util.Scanner;
 public class IT26102573Lab6Q1{
  public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  
	  double number;
	  System.out.println("Enter the number");
	   number = input.nextInt();
	   
	   
	  double square;
	  double squareroot;
	  square =number*number;
	  squareroot=Math.sqrt(number);
	  System.out.println("square value of"+" "+number+" " + "is:"+" "+square);
	  System.out.println("square root value of"+" "+number+ " "+ "is:" +" " +squareroot);
	  
   
  }
  
 }