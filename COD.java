class COD {  
    public static void main(String args[]){  
     System.out.println("Implement COD Functionality");
     public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
     System.out.println("Implemented COD Functionality");  
    }  
}  
