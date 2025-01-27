class Pattern1{

public static void main(String[] args){

int size = 3;
  displayPattern1(size);
  displayPattern2(size);
  displayPattern3(size);
}


public static void displayPattern1(int size){
  int spaces;
  System.out.println();
for(int line = 1; line <= size ; line++ ){
      for( spaces = size-line; spaces>0; spaces--){
        System.out.print(" ");
      }
      for(int stars = 2*line-1; stars>0; stars--){
        if(stars % 2 == 0){
          System.out.print(" ");
        }
        else{
          System.out.print("+");
        }
      }
    System.out.println();
    }

for(int line = size - 1; line > 0 ; line-- ){
    for( spaces = size - line; spaces > 0; spaces--){
      System.out.print(" ");
    }
    for(int stars = 2*line-1; stars>0; stars--){
        if(stars % 2 == 0){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
    }
  System.out.println();
  }
  System.out.println();
}

public static void displayPattern2(int size){
  int spaces;
  for(int line = 1; line <= size ; line++ ){
    for( spaces = size-line; spaces>0; spaces--){
      System.out.print(" ");
    }
    for(int stars = 2*line-1; stars>0; stars--){
      System.out.print("+");
    }
  System.out.println();
  }

  for(int line = size - 1; line > 0 ; line-- ){
    for( spaces = size - line; spaces > 0; spaces--){
      System.out.print(" ");
    }
    for(int stars = 2*line-1; stars>0; stars--){
      System.out.print("+");
    }
  System.out.println();
  }
  System.out.println();
}


public static void displayPattern3(int size){
int spaces;
  for(int line = 1; line <= size ; line++ ){
    for( spaces = size-line; spaces>0; spaces--){
      System.out.print(" ");
    }
    for(int stars = 2*line-1; stars>0; stars--){
      if((stars - line)%2 == 0){
      System.out.print("+");      
       }  
      else{     
      System.out.print("*");
      }
    }
  System.out.println();
  }
  
  for(int line = size ; line > 0 ; line-- ){
    for( spaces = size - line; spaces > 0; spaces--){
      System.out.print(" ");
    }
    for(int stars = 2*line-1; stars>0; stars--){
      if((stars - line)%2 == 0){
      System.out.print("*");      
       }  
      else{     
      System.out.print("+");
      }
    }
  System.out.println();
  }
  
  System.out.println();
  }
  }

