import java.util.Scanner;
  public class IT24104143Lab10Q2{
  public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   
   System.out.println();
   System.out.print("Enter the mark (0-100) : ");
   int mark = input.nextInt();
   
   assert(mark >= 0 && mark<=100) : "Invalid mark";
   
   System.out.println();
   System.out.println("Mark is Validated");
   
   char grade;
   if (mark >= 75){
   grade = 'A';
   }
   
   else if (mark>=60){
   grade = 'B';
   }
   
   else if (mark>=50){
   grade = 'C';
   }
   
   else if (mark>=40){
   grade = 'D';
   }
   
   else 
   {
   grade = 'F';
   }
   assert(mark >= 75&& grade == 'A')||
         (mark >=60 && mark <=74 && grade == 'B')||
		 (mark >=50 && mark <=59 && grade == 'C')||
		 (mark >=40 && mark<=49 && grade == 'D')||
		 (mark <=39 && grade == 'F'): "Incorrect Grade Assigned";
		 
		 
		 System.out.print("");
		 System.out.println("The grade for the Entered mark is :"+grade);
     }
   }