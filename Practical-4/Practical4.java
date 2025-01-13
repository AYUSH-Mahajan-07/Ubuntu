class Practical4{

public static int getShort(int num){
     int ans = 0 ;
     int temp = num / 32768;
     double temp2 = Math.floor(temp);
     
     while(temp2 >= 0){
         if(temp2 % 2 == 0 ){
             ans = num % 32768;
         }
         else{
             ans = num % 32768 - 32768;
         }
     break;
     }
     while(temp2 < 0){
         if(temp2 % 2 != 0){
            ans = num % 32768 + 32768;
         }
         else{
             ans = num %32768;
         }
     break;
     }
     return ans ;
}
//getByte code starts from here
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
 
 public static int getNumber(int num, String type) {
        type = type.toLowerCase(); 
        
        if (type.equals("byte")) {
            return getByte(num);
        } else if (type.equals("short")) {
            return getShort(num);
        } else {
            throw new IllegalArgumentException("Invalid type:");
        }
    }

public static void main(String[] args){
      int num = 130;
      System.out.println(" answer of getShort is : "+ getShort(num));
      System.out.println(" answer of getByte is : "+ getByte(num));
      int byteNum = 128;  
      int shortNum = 32769; 

      System.out.println("Value of getByte = " + getNumber(byteNum, "byte"));
      System.out.println("Value of getShort = " + getNumber(shortNum, "shOrt"));
  }

}
