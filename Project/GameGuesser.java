package Project;
import java.util.*;

public class GameGuesser 
{   
    Scanner s=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("game started");
        Umpire u=new Umpire();
        for(int i=1; i<=3; i++)
        {
            System.out.println("round "+i);
            u.collectNumFromGuesser();
            u.collectNumFromPlayers();
            u.compare();
            u.roundScore();
        }
            u.result();
        System.out.println("game Over");
        
    }
}

class Umpire
{
    Scanner s=new Scanner(System.in);
    int guesserNum;
    int player1Num;
    int player2Num;
    int player3Num;
    int player1Score=0;
    int player2Score=0;
    int player3Score=0;

    void result()
    {
        if(player1Score==player2Score && player1Score==player3Score)
        {
            System.out.println("Match Tied");
        }
        else if(player1Score>player2Score && player1Score> player3Score)
        {
            System.out.println("Winner: Player1 Score: "+player1Score);
        }
        else if(player2Score>player3Score)
        {
            System.out.println("Winner: Player2 Score: "+player2Score);
        }
        else
        {
            System.out.println("Winner: Player3 Score: "+player3Score);
        }
        
    }
    void roundScore()
    {
        System.out.println("Player1 Score: "+player1Score);
        System.out.println("Player2 Score: "+player2Score);
        System.out.println("Player3 Score: "+player3Score);
    }

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        guesserNum=g.guessNum();

    }
    void collectNumFromPlayers()
    {
        Players p1=new Players();
        Players p2=new Players();
        Players p3=new Players();

        player1Num=p1.guessNum();
        player2Num=p2.guessNum();
        player3Num=p3.guessNum();

    }
    void compare()
    {
        if(player1Num==guesserNum)
        {
            if(player2Num==guesserNum && player3Num==guesserNum)
            {
                player1Score++;
                player2Score++;
                player3Score++;
            }
            else if(player2Num==guesserNum)
            {
                player1Score++;
                player2Score++;
            }
            else if(player3Num==guesserNum)
            {
                player1Score++;
                player3Score++;
            }
            else
            {
                player1Score++;
            }
        }

        else if(player2Num==guesserNum)
        {
            if(player3Num==guesserNum)
            {
                player2Score++;
                player3Score++;
            }
            else
            {
                player2Score++;
            }
        }

        else if(player3Num==guesserNum)
        {
            player3Score++;   
        }

        }

    }


class Guesser
{
    Scanner s=new Scanner(System.in);
    int guesserNum;

    int guessNum()
    {
        System.out.println("guesser guess num");
        guesserNum=s.nextInt();
        return guesserNum;
    }
}

class Players
{
    Scanner s=new Scanner(System.in);
    int playerNum;

     int guessNum()
    {
        System.out.println("Player guess num");
        playerNum=s.nextInt();
        return playerNum;
    }
    
}
