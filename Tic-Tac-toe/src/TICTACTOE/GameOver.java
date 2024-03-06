package TICTACTOE;

public class GameOver {
    char[][] gameBoard= new char[0][];
    public static boolean isGameOver(char[][] gameBoard){
        if(gameBoard[0][0]=='X' && gameBoard[0][2]== 'X' && gameBoard[0][4]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }
        if(gameBoard[0][0]=='O' && gameBoard[0][2]== 'O' && gameBoard[0][4]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }
        if(gameBoard[0][0]=='X' && gameBoard[1][0]== 'X' && gameBoard[2][0]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }
        if(gameBoard[0][0]=='O' && gameBoard[1][0]== 'O' && gameBoard[2][0]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }
        if(gameBoard[0][2]=='X' && gameBoard[1][2]== 'X' && gameBoard[2][2]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }

        if(gameBoard[0][2]=='O' && gameBoard[1][2]== 'O' && gameBoard[2][2]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }

        if(gameBoard[0][4]=='X' && gameBoard[1][4]== 'X' && gameBoard[2][4]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }

        if(gameBoard[0][4]=='O' && gameBoard[1][4]== 'O' && gameBoard[2][4]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }

        if(gameBoard[1][0]=='X' && gameBoard[1][2]== 'X' && gameBoard[1][4]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }

        if(gameBoard[1][0]=='O' && gameBoard[1][2]== 'O' && gameBoard[1][4]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }

        if(gameBoard[2][0]=='X' && gameBoard[2][2]== 'X' && gameBoard[2][4]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }

        if(gameBoard[2][0]=='O' && gameBoard[2][2]== 'O' && gameBoard[2][4]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }
        //diagonale

        if(gameBoard[0][0]=='X' && gameBoard[1][2]== 'X' && gameBoard[2][4]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }

        if(gameBoard[0][0]=='O' && gameBoard[1][2]== 'O' && gameBoard[2][4]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }

        if(gameBoard[0][4]=='X' && gameBoard[1][2]== 'X' && gameBoard[2][0]=='X'){
            System.out.println("TICTACTOE.Player wins");
            return true;
        }

        if(gameBoard[0][4]=='O' && gameBoard[1][2]== 'O' && gameBoard[2][0]=='O'){
            System.out.println("TICTACTOE.Computer wins");
            return true;
        }

        if(gameBoard[0][0] !='_' && gameBoard[0][2] !='_' && gameBoard[0][4]!='_' &&  gameBoard[1][0]!='_' && gameBoard[1][2]!='_' && gameBoard[1][4]!='_'&& gameBoard[2][0]!=' ' && gameBoard[2][2]!=' ' && gameBoard[2][4]!=' '){
            System.out.println("It's a tie");
            return true;
        }
        return false; }
}
