package mrkool.Game1.Interfaces;

public interface TTTGame {
    void Display(char[][] Board);
    void Insert(int Pos,char[][] Board,char c);
    void CheckWinner();
    void CheckDraw();
}
