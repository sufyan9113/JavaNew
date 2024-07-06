package Operators;
class TypeCasting {
    public static void main(String[] args) {
       
      int a=10;
      
      double b= a;
      
      System.out.println(b); //implisit type casting

      double x=5.3;
      int y=(int)x;//explisit type casting
      System.out.println(y);

      int c=51;
      int d=10;
      double e=c/d; // if we perform operation on two int, result will be in integer form
      System.out.println(e);

        
    }
}

