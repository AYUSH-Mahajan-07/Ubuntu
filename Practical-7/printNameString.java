class Practical7 {

  public static void main(String[] args) {
    int size = 5;
    if(args.length > 0) {
        size = Integer.parseInt(args[0]);
    }
    System.out.print(displayPatternAYUSH(size));
  }
  
  public static String displayPatternAYUSH(int size) {
    if(size < 4) {
        size = 5;
    }
    else if(size > 15) {
        size = 15;
    }
    String pattern = "";
    for (int line = 1; line <= size; line++) {
      pattern = pattern + displayPatternA(line, size) + "  ";
      pattern = pattern + displayPatternY(line, size) + "  ";
      pattern = pattern + displayPatternU(line, size) + "  ";
      pattern = pattern + displayPatternS(line, size) + "  ";
      pattern = pattern + displayPatternH(line, size) + "\n";
    }
    return pattern;
  }

  public static String displayPatternA(int line, int size) {
    int midline = (size + 1) / 2;
    String pattern = "";
    for(int stars = 1; stars <= size; stars++) {
      if(line == 1 || stars == 1) {
        pattern = pattern + "*";
      } 
      else if(stars == size || line == midline){
        pattern = pattern + "*";
      }
      else{
        pattern = pattern + " ";
      }
    }
    return pattern;
  }

  public static String displayPatternY(int line, int size) {
    int midline = (size + 1) / 2;
    String pattern = "";
    for(int stars = 1; stars <= size; stars++) {
      if(line < midline && (stars == 1 || stars == size)) {
        pattern = pattern + "*";
      } 
      else if(line >= midline && (stars == midline || line == midline)) {
        pattern = pattern + "*";
      } 
      else{
        pattern = pattern + " ";
      }
     }
    return pattern;
  }

  public static String displayPatternU(int line, int size) {
    String pattern = "";
    for(int stars = 1; stars <= size; stars++) {
      if(stars == 1 || stars == size || line == size) {
        pattern = pattern + "*";
      } 
      else{
        pattern = pattern + " ";
      }
     }
    return pattern;
   }

  public static String displayPatternS(int line, int size) {
    int midline = (size + 1) / 2;
    String pattern = "";
    for(int stars = 1; stars <= size; stars++) {
      if(line == 1 || line == midline || line == size) {
        pattern = pattern + "*";
      } 
      else if(line < midline && stars == 1) {
        pattern = pattern + "*";
      } 
      else if(line > midline && stars == size) {
        pattern = pattern + "*";
      } 
      else{
        pattern = pattern + " ";
      }
    }
    return pattern;
   }

  public static String displayPatternH(int line, int size) {
    int midline = (size + 1) / 2;
    String pattern = "";
    for(int stars = 1; stars <= size; stars++) {
      if(stars == 1 || stars == size) {
        pattern = pattern + "*";
      } 
      else if(line == midline){
        pattern = pattern + "*";
      }
      else{
        pattern = pattern + " ";
      }
    }
    return pattern;
  }
 }

