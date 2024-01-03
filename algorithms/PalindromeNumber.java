
class PalindromeNumber {
    private int reverseNum(int num) {
        int reversedNumber = 0;
        while(num != 0){
            int digit = num % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            num = num /10;
        }
        return reversedNumber;
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (reverseNum(x) == x) {
            return true;
        }

        return false;
    }
}
