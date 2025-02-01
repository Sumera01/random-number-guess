import java.util.Random;
import java.util.Scanner;

public class program {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random r =new Random();
        int no = r.nextInt(100);
        //System.out.println(no); uncomment this to see the random number

        System.out.print("Enter a number:");

        int guess,count=0;
        do
        {
            guess=in.nextInt();
            count++;
            if(guess!=no)
            {
                //(guess<no) ? System.out.println("Too low ! Try agian ") : System.out.println("Too low ! Try agian ");
                if(guess>no)
                {
                    System.out.println("Too High Try Again");

                }
                else{
                    System.out.println("Too Low Try Again");
                }

            }

        }while(no!=guess);
        System.out.println("Congratulations guessed right number in "+ count + " attempts");
    }

}
