class Practical4B{

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

public static void main(String[] args){
      int num = 130;
      System.out.println(" answer of getShort is : "+ getShort(num));
}

}
