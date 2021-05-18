package challenges;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;

public class ReverseString {

    public static String reverseStringCharArr(String s){
        if(s.length() < 2){
            return s;
        }
        char[] charString = s.toCharArray();
        char[] reversedChar = new char[charString.length];

        for(int i=0; i<charString.length; i++){
            reversedChar[i] = charString[charString.length-i-1];
        }

        return String.copyValueOf(reversedChar);
    }

    public static String reverseStringBuilder(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.insert(0,ch);
        }

        return sb.toString();
    }

    public static String reverseStringIterator(String s){
        StringBuilder sb = new StringBuilder();
        PrimitiveIterator.OfInt it = s.chars().iterator();
        while(it.hasNext()){
            sb.insert(0,Character.toChars(it.next()));
        }
        return sb.toString();
    }

    public static String reverseStringStream(String s){
        StringBuilder sb = new StringBuilder();
        s.chars().mapToObj(Character::toChars).forEach(ch -> sb.insert(0,ch));

        return sb.toString();
    }
}
