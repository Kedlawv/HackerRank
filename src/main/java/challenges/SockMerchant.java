package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.groupingBy;

public class SockMerchant {
    public int sockMerchantSolution(int n, int[] ar){
        Arrays.sort(ar);
        int numberOfPairs = 0;
        for(int i=0; i<n; i++){
            int currentColor = ar[i];
            int numberOfSocks = 1;
            for(int j = i+1; j<n; j++, i++){
                if(currentColor == ar[j]){
                    numberOfSocks++;
                }
                else{
                    break;
                }
            }
            numberOfPairs += numberOfSocks / 2;
        }
        return numberOfPairs;
    }

    public int sockMerchantSolutionStream(int n, int[] ar){
        return Arrays.stream(ar)
                .boxed()
                .collect(groupingBy(i -> i))
                .values()
                .stream()
                .map(List::size)
                .reduce(0,(totalPairs,element) -> totalPairs += element / 2);
    }
}
