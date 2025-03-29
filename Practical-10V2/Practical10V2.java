import java.util.Random;
import java.util.Scanner;

class Practical10V2 {
    public static void main(String[] args) {
        int grid = 6;
        Practical10V2 sudoku = new Practical10V2();
        sudoku.play(grid);
    }

    public void play(int grid) {
        if (grid <= 1) {
            System.out.println("Please enter a valid grid size (above than 1)");
            return;
        }

        //All Task - completeBoard, removeNumbers,

        int[][] board = new int[grid][grid];
        completeBoard(board, grid);  
        removeNumbers(board, grid);
        userTask(board, grid);
        checkSolution(board, grid);
    }

    public void completeBoard(int[][] board, int grid) {
        Random rand = new Random(); //using random utility here
        for (int i=0; i<grid; i++) { 
            boolean[] used = new boolean[grid + 1];
            for (int j=0; j<grid; j++) {
                int num;
                do {
                    num = rand.nextInt(grid) + 1;
                } while (used[num] || isInColumn(board, j, num, i));
                board[i][j] = num;
                used[num] = true;
            }
        }
    }

    public boolean isInColumn(int[][] board, int col, int num, int maxRow) {
        for (int i=0; i<maxRow; i++) {
            if (board[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    public void removeNumbers(int[][] board, int grid) {
        Random rand = new Random();
        int count = (grid * grid) / 3;
        while (count > 0) {
            int r = rand.nextInt(grid);
            int c = rand.nextInt(grid);
            if (board[r][c] != 0) {
                board[r][c] = 0;
                count--;
            }
        }
    }

    public void userTask(int[][] board, int grid) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showBoard(board, grid);
            System.out.print("Enter row (1-" + grid + ") or 0 to quit: ");
            int row = sc.nextInt() - 1;
            if (row == -1) break;

            System.out.print("Enter column (1-" + grid + "): ");
            int col = sc.nextInt() - 1;
            
            if (row < 0 || row >= grid || col < 0 || col >= grid) {
                System.out.println("Invalid input");
                continue;
            }
            if (board[row][col] != 0) {
                System.out.println("Cell already filled");
                continue;
            }
            System.out.print("Enter number (1-" + grid + "): ");
            int num = sc.nextInt();
            board[row][col] = num;
        }
    }

    public void showBoard(int[][] board, int grid) {
        for (int i=0; i<grid; i++) {
            for (int j=0; j<grid; j++) {
                System.out.print("+ - ");
            }
            System.out.println("+");
            for (int j=0; j<grid; j++) {
                System.out.print("| ");
                if (board[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println("|");
        }
        for (int j=0; j<grid; j++) {
            System.out.print("+ - ");
        }
        System.out.println("+");
    }

    public void checkSolution(int[][] board, int grid) {
        System.out.println("Checking solution...");
        if (isCorrect(board, grid)) {
            System.out.println("Correct solution!");
        } else {
            System.out.println("Incorrect solution.");
        }
    }

    public boolean isCorrect(int[][] board, int grid) {
        for (int i=0; i<grid; i++) {
            boolean[] rowCheck = new boolean[grid + 1];
            boolean[] colCheck = new boolean[grid + 1];
            for (int j=0; j<grid; j++) {
                int rowVal = board[i][j];
                int colVal = board[j][i];
                if (rowVal != 0 && rowCheck[rowVal]){ 
                    return false;}
                if (colVal != 0 && colCheck[colVal]) {
                    return false;
                }
                rowCheck[rowVal] = true;
                colCheck[colVal] = true;
            }
        }
        return true;
    }
}
