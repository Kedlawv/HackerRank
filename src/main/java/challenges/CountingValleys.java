package challenges;

public class CountingValleys {

    public int countingValleysSolution(int n, String s) {
        char[] hikeSteps = s.toCharArray();
        int nValleys = 0;
        int elevation = 0;
        for (int i = 0; i < n - 1; i++) {
            elevation += hikeSteps[i] == 'U' ? 1 : -1;
            if (hikeSteps[i] == 'D' && hikeSteps[i + 1] == 'U' && elevation < 0) {
                nValleys++;
                while (elevation != 0) {
                    elevation += hikeSteps[++i] == 'U' ? 1 : -1;
                }
            }
        }
        return nValleys;
    }
}
