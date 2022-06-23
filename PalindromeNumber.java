public class PalindromeNumber {
    //1 решение, но не слишком эффективное
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(number);
        reversed.reverse();
        return number.equals(reversed.toString());
    }

    //2 решение, эффективнее
    public boolean isPalindrome(int x) {
        if(x >= 0) {
            int reversed = 0;
            int backup = x;

            while(backup != 0) {
                int remainder = backup % 10;
                reversed = reversed * 10 + remainder;
                backup = backup / 10;
            }
            return reversed == x;
        }
        return false;
    }
}
