import java.util.*;

public class Task2 {
    public static void main(String[] args){
        System.out.println("|-----Welcome to the Grade Calculation Sytem-----|");

        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter your marks in Maths: ");
        float maths= sc.nextFloat();

        System.out.println("Enter your marks in Science: ");
        float science= sc.nextFloat();
        
        System.out.println("Enter your marks in English: ");
        float english= sc.nextFloat();

        System.out.println("Enter your marks in Computer: ");
        float computer= sc.nextFloat();

        System.out.println("Enter your marks in Nepali: ");
        float nepali= sc.nextFloat();

        float total= maths+science+english+computer+nepali;
        System.out.println("Your total marks is "+total);

        float avepercent= (total/5);
        System.out.println("Your percentage is "+ avepercent+ "%");

        if(avepercent>=90.0){
            System.out.println("Grade: A+");
        } else if(avepercent>=80.0){
            System.out.println("Grade: A");
        } else if(avepercent>=70.0){
            System.out.println("Grade: B+");
        } else if(avepercent>=60.0){
            System.out.println("Grade: B");
        } else if(avepercent>=50.0){
            System.out.println("Grade: C+");
        } else  if(avepercent>=40.0){
            System.out.println("Grade: C");
        } else  if(avepercent>=20.0){
            System.out.println("Grade: D");
        } else  if(avepercent<20){
            System.out.println("Not Graded");
        }
        sc.close();
    }
}
