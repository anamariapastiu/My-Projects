package TICTACTOE;

import java.util.Random;

public class Computer {
    public void computerMove(char[][] gameBoard){
        Random random=new Random();
        UpdateBoard u = new UpdateBoard();
        int move= random.nextInt(9)+1;

        boolean result= ValidMove.isValidMove(move,gameBoard);
        while(!result){
            move= random.nextInt(9)+1;
            result= ValidMove.isValidMove(move,gameBoard);
        }
        System.out.println("Move at position" + move);
        u.updateBoard(move,2,gameBoard);

    }
}
