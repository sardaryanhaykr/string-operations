import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtil {
    private StringUtil(){}

//Returns  sum the lengths of two strings
    public static int sumOfLength(String s1,String s2){
        return s1.length()+s2.length();
    }
//Returns  is s1 lexicographically greater than s2 .
   private static boolean isBig(String s1,String s2){
      return s1.compareTo(s2)>0;
    }
//Print result is s1 greater than s2
    public static void printResult(String s1,String s2){
       if(isBig(s1,s2)){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
 //   capitalize the first letter in both s1 and s2 and concat separated by a space.
    public static String concatAndUppercase(String s1,String s2){
        return Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" "+
                Character.toUpperCase(s2.charAt(0))+s2.substring(1);
    }
//This method defines two strings anagram
    private static boolean isAnnagram(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
//This method defines two strings case-insensitive anagrams
    private static boolean isCaseInsensitiveAnnagram(String s1,String s2){
        String temp1=s1.toUpperCase();
        String temp2=s2.toUpperCase();
        return isAnnagram(temp1,temp2);
    }
//print two strings case-insensitive anagrams
    public static void printCaseInsensitiveAnnagram(String s1,String s2){
        if(isCaseInsensitiveAnnagram(s1,s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagarams");
        }
    }
}
