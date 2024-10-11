public class baitap2 {
    // kiem tra so thuan nghich
    public static boolean isPalindrome(String num){
        int A = num.length();
        for (int i = 0; i < A; i++) {
            if (num.charAt(i)!=num.charAt(A-i-1)) { return false;
            }
        }
            return true;

    }  
    public static boolean isvalidDigits(String numStr){
        for (char c : numStr.toCharArray()){
            if (c!='0'&& c!='6'&& c!='8') {
                return false;}
            }
            return true;        
            }
         
    public static void main(String[] args) {
        for (long i = 1000000;i<=9999999;i++) { String numStr = Long.toString(i);
            if (isPalindrome(numStr)&&isvalidDigits(numStr)) {System.out.println("so thuan nghich:"+i);      
            } 
    }
}
}



