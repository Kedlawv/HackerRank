package challenges;

public class BinaryGap {

    public static int solution(int N) {
        String[] binaryString = Integer.toBinaryString(N).split("");
        System.out.println(N);
        for(String s : binaryString){
            System.out.print(s);
        }
        // two loops , outer -> find 1
        // inner count 0's until next 1 , write number of iterations if larger than existing
        // continue
        int maxGap = 0;
        int gapLength = 0;
        boolean seqStart = false;
        for(int i = 0; i < binaryString.length; i++){

            // start of sequance
            if(binaryString[i].equals("1") && !seqStart){
                seqStart = true;
                continue;
            }
            // count gap
            if(binaryString[i].equals("0") && seqStart){
                gapLength++;
                continue;
            }
            // end of sequance
            if(binaryString[i].equals("1") && seqStart){
                maxGap = Math.max(gapLength,maxGap);
                gapLength = 0;
            }

        }

        return maxGap;

    }
}
