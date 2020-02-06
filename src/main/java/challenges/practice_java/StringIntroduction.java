package challenges.practice_java;

public class StringIntroduction {

    public static int sumLengths(String a, String b){
        return a.length() + b.length();
    }

    public static int compareLex(String a, String b){
        return a.compareTo(b);
    }

    public static String capitalizeAndJoin(String a, String b){
        return a.substring(0,1).toUpperCase() + a.substring(1) + " "
                + b.substring(0,1).toUpperCase() + b.substring(1);
    }
}
