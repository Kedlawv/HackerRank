package challenges;

public class JumpingOnTheClouds {
    public int cloudJump(int[] c){
        // We can move 1 or two indexes
        // Longer jump is preferred
        // Make sure we don't over jump
        // indices  containing 0s are ok to move to 1s are forbidden
        // There will never be two 1 in a row
        // Last one can't be 1

        int nJumps = 0;
        int i = 0;
        while(i<c.length-1){
            if(i+2 < c.length && c[i+2] == 0) {
                nJumps++;
                i += 2;
                continue;
            }
            if(c[i+1]==0){
                nJumps++;
                i++;
            }
        }
        return nJumps;
    }
}
