package challenges;

import java.util.Arrays;

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
}
