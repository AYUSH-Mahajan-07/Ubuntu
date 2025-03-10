class Practical10 {
  public static void main(String[] args) {
    int grid = 9; // Grid size (fixed at 9)
    Practical10 generator = new Practical10();
    generator.sudoku(grid);
  }

  public void sudoku(int grid) {
      if (grid <= 0) {
      System.out.println("Input positive value of grid and should be greater than 0");
      return;
    }

  // Initialize the Sudoku-like grid
    int[][] array = new int[grid][grid];
      for (int i = 0; i < grid; i++) {
        for (int j = 0; j < grid; j++) {
        array[i][j] = (i + j) % grid + 1;
        }
    } 

  // Remove portion (1/3)
    int numbersToRemove = (grid * grid) / 3;
      while (numbersToRemove > 0) {
      int row = (int) (System.nanoTime() % grid);
      int col = (int) ((System.nanoTime() / grid) % grid);

        if (array[row][col] != 0) {
        array[row][col] = 0;
        numbersToRemove--;
        }
      }       

  // grid printing
    for (int i = 0; i < grid; i++) {
      for (int j = 0; j < grid; j++) {
      System.out.print(" ---");
      }
    System.out.println();

    for (int j = 0; j < grid; j++) {
      if (array[i][j] == 0) {
      System.out.print("|   ");
      } 
      else {
      System.out.printf("| %d ", array[i][j]);
      }
    }
    System.out.println("|");
    }

  // Printing last grid line
    for (int j = 0; j < grid; j++) {
      System.out.print(" ---");
    }
      System.out.println();
  }
  
  
}
