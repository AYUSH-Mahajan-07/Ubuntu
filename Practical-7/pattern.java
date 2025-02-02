class Pattern {

    public static void main(String[] args) {
        int size = 5;
        displayPatternAYUSH(size);
    }

    public static void displayPatternAYUSH(int size) {
    if(size<4){
    size = 5;
    }
        for (int line = 1; line <= size; line++) {
            displayPatternA(line, size);
            System.out.print("  ");
            displayPatternY(line, size);
            System.out.print("  ");
            displayPatternU(line, size);
            System.out.print("  ");
            displayPatternS(line, size);
            System.out.print("  ");
            displayPatternH(line, size);
            System.out.println();
        }
    }

    public static void displayPatternA(int line, int size) {
    int midline = (size + 1) / 2; 
      for(int stars = 1; stars <= size ; stars++){
        if(line == 1 || stars == 1 || stars == size ){
          System.out.print("*");
        }
        else if(line == midline){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
        
      }
    }

    public static void displayPatternY(int line, int size) {
    int midline = (size + 1) / 2; 
      for(int stars = 1; stars <= size ; stars++){
      if(line<midline){
        if(stars == 1 || stars == size){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      else if(stars == midline){
          System.out.print("*");
         }  
       else if(line == midline){
          System.out.print("*");
        }

        else{
          System.out.print(" ");
        } 
      }
    }

    public static void displayPatternU(int line, int size) {
      for(int stars = 1; stars <= size ; stars++){
        if( stars == 1 || stars == size || line == size ){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }  
      }
    }
    

    public static void displayPatternS(int line, int size) {
    int midline = (size + 1) / 2; 
    for (int stars = 1; stars <= size; stars++) {
        if (line==1 || line == midline) {
          System.out.print("*");
        }
        else if(line == size){
          System.out.print("*");
        }
        else if (line < midline && stars==1) {
          System.out.print("*");
        }
        else if (line > midline && stars==size) {
          System.out.print("*");
        } 
        else {
          System.out.print(" ");
        }
    }
    }

    public static void displayPatternH(int line, int size) {
    int midline = (size + 1) / 2; 
        for(int stars = 1; stars <= size ; stars++){
        if(stars == 1 || stars == size ){
          System.out.print("*");
        }
        else if(line == midline){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
        
      }
    }
    }
