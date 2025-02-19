class IT2023BIT040{

 public static void main(String[] args) {
 // recursive java code to reverse a string
    String s = "Utasav 2025";   
    System.out.println(reverse(s));

 // recursive java method to calculate the sum of digit
    int number = 170225;
    System.out.println(sumOfDigit(number));
    
 // recursive java method to check if given number is palindrome or not
    String s1 = "171";
    System.out.println(isPalindrome(s1));
  }

//---------------------------------------------------------------------------

  public static String reverse(String inputString){
    if(inputString.isEmpty()){
      return inputString;
    }
    else{
      return reverse(inputString.substring(1)) + inputString.charAt(0); 
    } 
  }

//---------------------------------------------------------------------------

  public static int sumOfDigit(int number){
    if(number == 0){
      return 0;
    }
    return (number%10) + sumOfDigit(number/10);
  }

//---------------------------------------------------------------------------

  public static boolean isPalindrome(String inputString){
    if (inputString.length() <= 1) {
        return true; 
    }
    if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1)) {
        return false; 
    }
    return isPalindrome(inputString.substring(1, inputString.length() - 1)); 
  }
}
