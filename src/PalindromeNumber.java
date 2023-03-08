/*Given an integer x, return true if x is a palindrome, and false otherwise.*/
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(1011));
    }

    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x).toLowerCase();
        String reversedValue = new StringBuilder(value).reverse().toString();
        return value.equals(reversedValue);
    }
}
