import java.util.Scanner;
public class NumGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        create gn = new create();
        int win = 0;
        while (true)
        {
            System.out.println("Enter the upper and lower limit :");
            int max = sc.nextInt();
            int min = sc.nextInt();
            int num1 = gn.creatednum(max, min);
            int attempts = 0;
            while (true)
            {
                System.out.println("Guess your number between "+max+" and "+min);
                int num2 = sc.nextInt();
                attempts++;
                if (num2 > num1)
                System.out.println("The number is greater.");
                else if (num2 < num1)
                System.out.println("The number is smaller.");
                else{
                    System.out.println("The number is guessed correctly !!");
                    win++;
                    break; }
            }
            int NumOfAttempts = 0;
            NumOfAttempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins = " + win);
            System.out.println("Your total score is " + NumOfAttempts);
            System.out.println("Continue playing ? Enter Y or N.");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("Y")){
            sc.close();
            System.exit(0); }
            sc.nextLine();
        }
    }
}
class create
{
    public int creatednum(int max,int min)
    {
        return (int) (Math.random()*(max - min + 1) + min);
    }
}
