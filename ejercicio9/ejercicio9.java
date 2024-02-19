package ejercicio9;



import java.util.Scanner;

public class ejercicio9 {

    private static final char EMPTY = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = PLAYER_X;

    public static void main(String[] args) {
        playTicTacToe();
    }

    public static void playTicTacToe() {
        initializeBoard();
        while (!isWinner(board) && !isDraw(board)) {
            printBoard();
            makeMove();
            switchPlayer();
        }
        printBoard();
        printResult();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void makeMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (!isValidMove(row, col));
        board[row][col] = currentPlayer;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    private static boolean isWinner(char[][] board) {
        return checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin();
    }

    private static boolean checkRowsForWin() {
        for (int i = 0; i < SIZE; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumnsForWin() {
        for (int i = 0; i < SIZE; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || checkRowCol(board[0][2], board[1][1], board[2][0]) == true);
    }

    private static boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != EMPTY) && (c1 == c2) && (c2 == c3));
    }

    private static boolean isDraw(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printResult() {
        if (isWinner(board)) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else if (isDraw(board)) {
            System.out.println("It's a draw!");
        }
    }
}
