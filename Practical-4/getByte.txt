class Practical4A{

public static int getByte(int num){
     int ans = 0 ;
     int temp = num / 128;
     double temp2 = Math.floor(temp);
    
      while(temp2 >= 0){
         if(temp2 % 2 == 0 ){
              ans = num % 128;
         }
          else{
             ans = num % 128 - 128;
         }
     break;
      }
      while(temp2 < 0){
          if(temp2 % 2 != 0){
              ans = num % 128 + 128;
          }
          else{
              ans = num %128 -128;
          }
      break;
      }
      return ans ;
 }

 
 public static void main(String[] args){
      int num = 130;
      System.out.println(" answer of getByte is : "+ getByte(num));
 
 }
}
