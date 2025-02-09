class Practical7{

  public static void main(String[] args){
      int size = 3;
      int line = 1;
      displayPatternA(size, line);
      displayPatternB(size, line);   
      displayPatternC(size, line);   
  }
  
  public static void displayPatternA(int size, int line){
  int stars = 1;
    if(line<=size+1){
        displayStarA(stars, line);
        System.out.println();
        
        displayPatternA(size, line+1);
        
        displayStarA(stars-1, line-2);
        System.out.println();
    }
  }

  public static void displayStarA(int stars, int line){
    if(stars<=line){
        System.out.print("*");
        displayStarA(stars+1, line);
    }
  }
  
  //part 2
  public static void displayPatternB(int size, int line){
    int stars = 1;
    if(line<=size){
        displaySpaceB(1, size-line);
        displayStarB(stars, 2*line-1);
        System.out.println();
        
        displayPatternB(size, line+1);
        
        displaySpaceB(0, size-line);
        displayStarB(stars+2, 2*line-1);
        System.out.println();
    }
  }  
  
  public static void displaySpaceB(int space, int spaceformula){
    if(space<=spaceformula){
        System.out.print(" ");
        displaySpaceB(space+1, spaceformula);
    }
  }
  
  public static void displayStarB(int stars, int starformula){
    if(stars<=starformula){
        System.out.print("*");
        displayStarB(stars+1, starformula);
    }
  }  
  
  //part 3
  public static void displayPatternC(int size, int line) {
    int stars = 1;
    if (line <= size + 1) {
        displaySpaceC(0, size - line);
        if (line == size + 1) {
            displayPlus(0, line);
        } else {
            displayStarC(stars, line);
        }
        System.out.println();

        displayPatternC(size, line + 1);

        displaySpaceC(-1, size - line);
        displayStarC2(stars, line - 1);
        System.out.println();
    }
  }

  public static void displaySpaceC(int space, int spaceformula) {
    if (space <= spaceformula) {
        System.out.print(" ");
        displaySpaceC(space + 1, spaceformula);
    }
  }

  public static void displayStarC(int stars, int line) {
    if (stars <= line) {
        System.out.print("*");
        displayStarC(stars + 1, line);
    }
  }

  public static void displayStarC2(int stars, int line) {
    if (stars <= line) {
        System.out.print("/");
        displayStarC2(stars + 1, line);
    }
  }

  public static void displayPlus(int plus, int line) {
    if (plus < line) {
        System.out.print("+");
        displayPlus(plus + 1, line);
    }
  }

  
}
