import java.time.temporal.ChronoField;
import java.util.Set;

public class Strings {
    public static boolean palindrome1(String str){
        if (str == null)
            return false;

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }

    public static boolean palindrome2(String str){
        if (str == null)
            return false;

        int length = str.length();
        System.out.println(length / 2);
        for (int  i = 0; i < length / 2;  i++) {
            if (str.charAt(i) != str.charAt( length - i - 1))
                return false;
        }
        return true;
    }

    public static String removeCharacter(String str, char c){
        if (str == null)
            return null;

        return str.replaceAll(Character.toString(c),"");
    }

    public static boolean compare(String str1, String str2){

        if (str1.compareTo(str2) != 0)
            return false;

        return true;

    }

    public static char [] toCharArry(String str){

        char [] charArr = str.toCharArray();

        return charArr;
    }

    public static Set<String> permutations(String str){
        return Permutations.permutationFinder(str);
    }
}
