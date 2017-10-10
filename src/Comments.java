
/*Comments Program
* Soulyana Lakew
* October 10, 2017
*/
import java.util.Random;
import java.util.Scanner;
public class Comments
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //initialize variables
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = random.nextInt(100) + (int)from;
        //initailize to zero in order for code to work
        int guessedNumber = 0;

        //Prints out range of values for guessed number
        System.out.printf("The number is between %d and %d.\n", from, to);

        //evaluates user input and assess where in range the guessed number falls. Prompts user until correct number found
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
} 