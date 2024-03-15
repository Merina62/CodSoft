import java.util.*;
public class Task1 {
    public static void main(String[] args){
        
        int min=1;
        int max=100;
        int attemptlimit= 5;
        Random rand = new Random();
        Scanner sc= new Scanner(System.in);

        System.out.println("\n|-----Welcome to Guess the Number Game-----|");
        System.out.println("\nYou have total "+attemptlimit+" attempts to guess the number.");


        boolean playagain= true;
        while(playagain){
            // Generate a random number between 1 and 100
            int randomNumber = rand.nextInt(max-min +1) + min;

            int attempt=0;
            boolean correctguess= false;
            while(attempt< attemptlimit	&& !correctguess){
                int remain= attemptlimit-attempt;
                System.out.println("\nAttempts remaining: "+remain);
                System.out.println("Guess a number between 1 to 100: ");
                int guess= sc.nextInt();
                attempt++;

                
                if(remain>=1){
                    if(guess == randomNumber ){
                        System.out.println("Congratulation, You guessed correct number");
                        correctguess=true;
                    }
                    else if(guess>randomNumber){
                        System.out.println("Guess number is high. Please try again.");
                    } else if(guess<randomNumber){
                        System.out.println("Guess Number is low. Please try again.");
                    } 
                }   
            }
            if(!correctguess){
                System.out.println("Sorry, you've run out of atttempts. The correct number was: "+randomNumber);
            }
            
            
            System.out.println("\nDo you want to play again(y/n): ");
            String choice= sc.next().toLowerCase();
            if(choice.equals("n")){
                playagain=false;
            } 

        }
        System.out.println("\nThank you for playing.");
        sc.close();
    }
    
}
