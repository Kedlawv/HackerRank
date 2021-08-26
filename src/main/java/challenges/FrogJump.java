package challenges;

public class FrogJump {
    /*
    A small frog wants to get to the other side of the road. The frog is currently located at position X and wants
    to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

    Count the minimal number of jumps that the small frog must perform to reach its target.

    Write a function:

    class Solution { public int solution(int X, int Y, int D); }

    that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal
    to or greater than Y.

    X, Y and D are integers within the range [1..1,000,000,000];
    X ≤ Y

     */

    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
