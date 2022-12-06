package mrkool.Game1.Classes;
import mrkool.Game1.Interfaces.TTTGAmeMode;
import java.util.Scanner;
import java.util.Random;


public class KickStartTTT implements TTTGAmeMode {

    int User1Pos, User2Pos;
    Random R = new Random();
    Scanner sc = new Scanner(System.in);

    char[][] Board = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    TicTacToeGame ttt = new TicTacToeGame();

    public void SinglePlayer() {
        ttt.Display(Board);
        while (true) {
            System.out.println("Enter the Position where to place X ");
            User1Pos = sc.nextInt();
            while (LaunchGame.AllUser1Pos.contains(User1Pos) || LaunchGame.AllUser2Pos.contains(User1Pos)) {
                System.out.println("Position already Taken!! retry");
                User1Pos = sc.nextInt();
            }
            ttt.Insert(User1Pos, Board, 'X');
            ttt.Display(Board);
            ttt.CheckWinner();
            ttt.CheckDraw();

            User2Pos = R.nextInt(1, 10);
            System.out.println("Cpu Position: " + User2Pos);
            while (LaunchGame.AllUser1Pos.contains(User2Pos) || LaunchGame.AllUser2Pos.contains(User2Pos)) {
                System.out.println("Position already Taken!! retry");
                User2Pos = R.nextInt(1, 10);
            }
            ttt.Insert(User2Pos, Board, 'O');
            ttt.Display(Board);
            ttt.CheckWinner();
            ttt.CheckDraw();
        }
    }

    public void DualPlayer() {
        ttt.Display(Board);
        while (true) {
            System.out.println("Enter the Position where to place X ");
            User1Pos = sc.nextInt();
            while (LaunchGame.AllUser1Pos.contains(User1Pos) || LaunchGame.AllUser2Pos.contains(User1Pos)) {
                System.out.println("Position already Taken!! retry");
                User1Pos = sc.nextInt();
            }
            ttt.Insert(User1Pos, Board, 'X');
            ttt.Display(Board);
            ttt.CheckWinner();
            ttt.CheckDraw();
            System.out.println("Enter the Position where to place O ");
            User2Pos = sc.nextInt();
            while (LaunchGame.AllUser1Pos.contains(User2Pos) || LaunchGame.AllUser2Pos.contains(User2Pos)) {
                System.out.println("Position already Taken!! retry");
                User2Pos = sc.nextInt();
            }
            ttt.Insert(User2Pos, Board, 'O');
            ttt.Display(Board);
            ttt.CheckWinner();
            ttt.CheckDraw();
        }

    }
}
