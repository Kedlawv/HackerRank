package challenges.generics;

public class GenericPrinter {

    public static <T> void printArray(T[] array) {
        for (T e : array) {
            System.out.println(e);
        }
    }
}
