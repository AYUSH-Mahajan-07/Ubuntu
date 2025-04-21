/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Random;

public class Sudoku {
  private int[][] grid;
    private int size;
    private String difficulty;

    public Sudoku(int size, String difficulty) {
        this.size = size;
        this.difficulty = difficulty;
        this.grid = new int[size][size];
    }

    public void generateGrid() {
        fillGridWithoutDuplicates();
        removeRandomCells();
    }

    private void fillGridWithoutDuplicates() {
        Random rand = new Random();

        for (int row = 0; row < size; row++) {
            boolean success;
            int attempts = 0;
            do {
                success = true;
                attempts++;
                if (attempts > 100) {
                    return; // Failsafe to avoid infinite loops
                }
                boolean[] usedInRow = new boolean[size + 1];
                for (int col = 0; col < size; col++) {
                    int numAttempts = 0;
                    int num;
                    do {
                        num = rand.nextInt(size) + 1;
                        numAttempts++;
                        if (numAttempts > 100) {
                            success = false;
                            break;
                        }
                    } while (usedInRow[num] || isNumberInColumn(col, num, row));

                    if (!success) {
                        break;
                    }

                    grid[row][col] = num;
                    usedInRow[num] = true;
                }
            } while (!success);
        }
    }

    private boolean isNumberInColumn(int col, int num, int currentRow) {
        for (int row = 0; row < size; row++) {
            if (row != currentRow && grid[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private void removeRandomCells() {
        int totalCells = size * size;
        double percentageToRemove;

        switch (difficulty.toLowerCase()) {
            case "easy":
                percentageToRemove = 0.30;
                break;
            case "medium":
                percentageToRemove = 0.60;
                break;
            case "hard":
                percentageToRemove = 0.75;
                break;
            default:
                percentageToRemove = 0.30; // fallback to easy
        }

        int numbersToRemove = (int) (totalCells * percentageToRemove);
        Random rand = new Random();

        while (numbersToRemove > 0) {
            int row = rand.nextInt(size);
            int col = rand.nextInt(size);
            if (grid[row][col] != 0) {
                grid[row][col] = 0;
                numbersToRemove--;
            }
        }
    }

    public boolean isValidSolution(int[][] userGrid) {
        // Check rows
        for (int row = 0; row < size; row++) {
            boolean[] rowCheck = new boolean[size + 1];
            for (int col = 0; col < size; col++) {
                int val = userGrid[row][col];
                if (val < 1 || val > size || rowCheck[val]) {
                    return false;
                }
                rowCheck[val] = true;
            }
        }

        // Check columns
        for (int col = 0; col < size; col++) {
            boolean[] colCheck = new boolean[size + 1];
            for (int row = 0; row < size; row++) {
                int val = userGrid[row][col];
                if (val < 1 || val > size || colCheck[val]) {
                    return false;
                }
                colCheck[val] = true;
            }
        }

        // Check subgrids (for 9x9 grid)
        if (size == 9) {
            for (int boxRow = 0; boxRow < 3; boxRow++) {
                for (int boxCol = 0; boxCol < 3; boxCol++) {
                    boolean[] boxCheck = new boolean[size + 1];
                    for (int row = boxRow * 3; row < (boxRow + 1) * 3; row++) {
                        for (int col = boxCol * 3; col < (boxCol + 1) * 3; col++) {
                            int val = userGrid[row][col];
                            if (val < 1 || val > size || boxCheck[val]) {
                                return false;
                            }
                            boxCheck[val] = true;
                        }
                    }
                }
            }
        }

        return true;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getSize() {
        return size;
    }

    public String getDifficulty() {
        return difficulty;
    }  
}
