package challenges.data_structures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DT_Solutions {


    public static int subarrayNegativeSum(int[] ints) {
        int sumOfNegative = 0;

        for (int i = 1; i <= ints.length; i++) {
            int[][] subArrays = getSubarraysOfLength(i, ints);

            for (int[] outer : subArrays) {
                int sum = 0;
                for (int n : outer) {
                    sum += n;
                }

                if (sum < 0) {
                    sumOfNegative++;
                }
            }
        }

        return sumOfNegative;
    }

    public static int[][] getSubarraysOfLength(int n, int[] arr) {
        int resultLength;
        resultLength = (arr.length - n) + 1;

        int[][] subArrays = new int[resultLength][];

        for (int i = 0; i < resultLength; i++) {
            subArrays[i] = Arrays.copyOfRange(arr, i, i + n);
        }

        return subArrays;
    }

    public static List<List<Integer>> csvToList(File file){

        List<List<Integer>> result = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()) {
                String[] stringInts = scanner.nextLine().split(" ");
                List<Integer> listOfInts = new ArrayList<>();
                for(String s : stringInts){
                    int n = Integer.parseInt(s);
                    if(n == 0){
                        continue;
                    }
                    listOfInts.add(n);
                }
                result.add(listOfInts);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return result;
    }

    public static int findIn2dList(int a, int b, List<List<Integer>> list2D){
        try {
            return list2D.get(a-1).get(b);
        }catch(Exception e){
            return Integer.MAX_VALUE;
        }
    }


}
