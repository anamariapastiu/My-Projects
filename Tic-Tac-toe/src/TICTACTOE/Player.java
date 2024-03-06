package TICTACTOE;

import java.util.Scanner;

public class Player {
    public void playerMove(char[][] gameBoard){
        UpdateBoard u = new UpdateBoard();
        System.out.println("Make a move (1-9)");
        Scanner input=new Scanner(System.in);

        int move=input.nextInt();

        boolean result= ValidMove.isValidMove(move,gameBoard);
        while(!result){
            System.out.println("Invalid Move! Try again");
            move=input.nextInt();
            result=ValidMove.isValidMove(move,gameBoard);
        }

        System.out.println("TICTACTOE.Player move at position" + move);
        u.updateBoard(move,1, gameBoard);
    }
}
