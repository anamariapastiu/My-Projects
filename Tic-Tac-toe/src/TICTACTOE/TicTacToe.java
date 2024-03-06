package TICTACTOE;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {' ', '|', ' ', '|', ' '}};
        PrintBoard p = new PrintBoard();
        Player player = new Player();
        Computer computer = new Computer();
        p.printBoard(gameBoard);

        boolean gameOver = false;
        while (!gameOver) {
            player.playerMove(gameBoard);
            gameOver = GameOver.isGameOver(gameBoard);
            if (gameOver) {
                break;
            }
            computer.computerMove(gameBoard);
            gameOver = GameOver.isGameOver(gameBoard);
            if (gameOver) {
                break;
            }
        }
        /*playerMove(gameBoard);
        computerMove(gameBoard);
        playerMove(gameBoard);
           */
    }
}