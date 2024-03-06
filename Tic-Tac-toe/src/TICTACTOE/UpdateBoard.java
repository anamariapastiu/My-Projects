package TICTACTOE;

public class UpdateBoard {

    public void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void updateBoard(int position, int player, char[][] gameBoard) {
        char caracter;
        if (player == 1) {
            caracter = 'X';
        } else {
            caracter = 'O';
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = caracter;
                printBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = caracter;
                printBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = caracter;
                printBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][0] = caracter;
                printBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = caracter;
                printBoard(gameBoard);
                break;
            case 6:
                gameBoard[1][4] = caracter;
                printBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][0] = caracter;
                printBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = caracter;
                printBoard(gameBoard);
                break;
            case 9:
                gameBoard[2][4] = caracter;
                printBoard(gameBoard);
                break;
            default:
                break;


        }
    }
}
