package test;

public class Palindrome {
    static boolean isPalindrome(int number){
        boolean palindrome = false;
        String str = Integer.valueOf(number).toString();
        String reverseStr = new StringBuilder(str).reverse().toString();

        if (str.toLowerCase().equals(reverseStr)){
            palindrome = true;
        }
        return palindrome;
    }

    static boolean isPalindrome2(int input){
        boolean palindrome = false;
        int reversedNum = 0;
        int input_number = input;

        while (input_number != 0) {
            reversedNum = reversedNum * 10 + input_number % 10;
            input_number = input_number / 10;
            int a=1;
        }

        if (input == reversedNum){
            palindrome = true;
        }
        return palindrome;
    }

    char i = 'a';
    


    public static void main(String[] args) {
        System.out.println(isPalindrome(7873787));
        System.out.println(isPalindrome2(232));
    }
}
