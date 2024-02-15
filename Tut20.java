//Create a simple Rock, Paper Scissors game in Java. (#Use Conditional Statements)
import java.util.Random;
import java.util.Scanner;
public class Tut20 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int user_chance,comp_chance,user_win=0,comp_win=0;
        System.out.println("Welcome to the Game : Scissor Paper Rock");
        for(int i = 0;i < 5; i++)
        {
            comp_chance = 1 + random.nextInt(3);
            System.out.println("Computer play : ");
            System.out.println(comp_chance);
            System.out.println("Enter the user play");
            user_chance = sc.nextInt();
            switch (comp_chance) {
                case 1:
                    if (user_chance == 1) 
                    {
                        System.out.println("Game Draw");
                    }
                    else if(user_chance == 2)
                    {
                        System.out.println("Computer wins the game");
                        comp_win++;
                    }
                    else if(user_chance == 3)
                    {
                        System.out.println("User wins the game");
                        user_win++;
                    }
                    break;
                case 2:
                    if (user_chance == 1) 
                    {
                        System.out.println("User Wins the game");
                        user_win++;
                    }
                    else if(user_chance == 2)
                    {
                        System.out.println("Game Draw");
                    }
                    else if(user_chance == 3)
                    {
                        System.out.println("Computer wins the game");
                        comp_win++;
                    }
                    break;
                case 3:
                    if (user_chance == 1) 
                    {
                        System.out.println("Computer Wins the game");
                        comp_win++;
                    }
                    else if(user_chance == 2)
                    {
                        System.out.println("User Wins the game");
                        user_win++;
                    }
                    else if(user_chance == 3)
                    {
                        System.out.println("Game Draw");
                    }
                    break;
                default:
                    break;
            }
        }
        if(user_win > comp_win)
        {
            System.out.println("User wins the series");
        }
        else if(user_win == comp_win)
        {
            System.out.println("Series Draw");
        }
        else
        {
            System.out.println("Computer wins the series");
        }
    }
}
