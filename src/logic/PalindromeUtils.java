package logic;

import java.util.List;

public class PalindromeUtils {
    private PalindromeUtils(){};

    public static boolean checkIfListOfIntegersIsPalindrome(List<Integer> list){
        int reverseIterator = list.size()-1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == list.get(reverseIterator)){
                if(i == reverseIterator || (list.get(i) - list.get(reverseIterator)) == 1) return true;
                reverseIterator--;
            }else{
                return false;
            }
        }
        return false;
    }

    public static void testFillNotListPalindrome(List<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    public static void testFillListPalindrome(List<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
    }
}
