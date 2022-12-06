package mrkool.Game1.Classes;
import java.util.*;
import mrkool.Game1.Interfaces.TTTGame;
public class TicTacToeGame implements TTTGame{
    public void Display(char[][] Board) {
        for (char[] chars : Board) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
    public void Insert(int pos, char[][] Board, char sym) {
        if(sym == 'X'){
            LaunchGame.AllUser1Pos.add(pos);
        }
        else if(sym == 'O') {
            LaunchGame.AllUser2Pos.add(pos);
        }
        switch(pos) {
            case 1: Board[0][0] = sym;
            break;
            case 2: Board[0][2] = sym;
            break;
            case 3: Board[0][4] = sym;
            break;
            case 4: Board[2][0] = sym;
            break;
            case 5: Board[2][2] = sym;
            break;
            case 6: Board[2][4] = sym;
            break;
            case 7: Board[4][0] = sym;
            break;
            case 8: Board[4][2] = sym;
            break;
            case 9: Board[4][4] = sym;
            break;
            default : System.out.println("Invalid Input");
        }
    }
    public void CheckWinner() {
        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> botRow = Arrays.asList(7,8,9);
        List<Integer> leftCol = Arrays.asList(1,4,7);
        List<Integer> midCol = Arrays.asList(2,5,8);
        List<Integer> rightCol = Arrays.asList(3,6,9);
        List<Integer> diag1 = Arrays.asList(1,5,9);
        List<Integer> diag2 = Arrays.asList(3,5,7);

        ArrayList<List<Integer>> allWinningConditions = new ArrayList<>();

        allWinningConditions.add(topRow);
        allWinningConditions.add(midRow);
        allWinningConditions.add(botRow);
        allWinningConditions.add(leftCol);
        allWinningConditions.add(midCol);
        allWinningConditions.add(rightCol);
        allWinningConditions.add(diag1);
        allWinningConditions.add(diag2);

        for(List<Integer> l: allWinningConditions)
        {
            if(LaunchGame.AllUser1Pos.containsAll(l))
            {
                System.out.println("User1 is the Winner");
                System.exit(0);
            }
            else if(LaunchGame.AllUser2Pos.containsAll(l))
            {
                System.out.println("User2 is the winner");
                System.exit(0);
            }
        }
    }
    public void CheckDraw() {
        if((LaunchGame.AllUser2Pos.size() + LaunchGame.AllUser1Pos.size()) ==9)
        {
            System.out.println("Game is a Draw");
            System.exit(0);
        }
    }
}
