import logic.PalindromeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> niepalindrom = new ArrayList<Integer>();
        List<Integer> palindrom = new ArrayList<Integer>();

        PalindromeUtils.testFillNotListPalindrome(niepalindrom);
        PalindromeUtils.testFillListPalindrome(palindrom);

        System.out.println("Is " + niepalindrom + " palindrome? : "
                + PalindromeUtils.checkIfListOfIntegersIsPalindrome(niepalindrom));
        System.out.println("Is " + palindrom + " palindrome? : "
                + PalindromeUtils.checkIfListOfIntegersIsPalindrome(palindrom));
    }


}
