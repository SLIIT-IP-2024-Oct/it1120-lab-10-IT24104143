import java.util.Scanner;
  public class IT24104143Lab10Q1{
  public static void main(String [] args){
	  
   //create Scanner input
   Scanner input = new Scanner(System.in);
   
   System.out.println();
   System.out.print("Enter the mark (0-100) : ");
   int mark = input.nextInt();
   
   //make asseret
   assert(mark >= 0 && mark<=100) : "Invalid mark";
   
   System.out.println();
   System.out.println("Mark is Validated");
     }
   }
  