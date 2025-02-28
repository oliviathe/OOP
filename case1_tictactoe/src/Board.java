import java.util.*;

public class Board {
    private char[][] board;
    private Scanner sc = new Scanner(System.in);
    
    public Board(){
        board = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
    }

    public void print(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean check(char symbol){
        String winCondition = ""+symbol+symbol+symbol;
        if(winCondition.equals(""+board[0][0] + board[0][1] + board[0][2]) ||
            winCondition.equals(""+board[1][0] + board[1][1] + board[1][2]) ||
            winCondition.equals(""+board[2][0] + board[2][1] + board[2][2]) ||
            winCondition.equals(""+board[0][0] + board[1][0] + board[2][0]) ||
            winCondition.equals(""+board[0][1] + board[1][1] + board[2][1]) ||
            winCondition.equals(""+board[0][2] + board[1][2] + board[2][2]) ||
            winCondition.equals(""+board[0][0] + board[1][1] + board[2][2]) ||
            winCondition.equals(""+board[0][2] + board[1][1] + board[2][0])) return true;
        return false;
    }

    public void input(int turn, char symbol){
        int x, y;
        do{
            System.out.print("Player " + (turn+1) + " move: ");
            x = sc.nextInt();
            y = sc.nextInt();
        } while(x < 0 || x > 2 || y < 0 || y > 2 || board[y][x] != '-');
        board[y][x] = symbol;
    }
}
