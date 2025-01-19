class Practical5{

public static void main (String[] args){
int n = 4;
System.out.println(getfactorial1(n));
System.out.println(getfactorial2(n+1));
System.out.println(getfactorial3(n+2));
}

public static int getfactorial1( int n ) {
if( n >= 0){
    if( n < 2 ){
      return 1;
    }
    else{
      int fact = 1;
      for ( ; 2<=n ; ){
      fact *= n--;
    }
    return fact ;
  }
}
return -1;
}

public static int getfactorial2( int n ) {
if( n >= 0){
    if( n < 2 ){
      return 1;
    }
    else{
      int fact = 1;
      while ( 2<=n ){
      fact *= n--;
    }
    return fact ;
  }
}
return -1;
}

public static int getfactorial3( int n ) {
if( n >= 0){
int fact;
    if( n < 2 ){
      return 1;
    }
    else{
      fact = n*getfactorial3(n-1);
     }
    return fact ;
  }
return -1;
}
}
