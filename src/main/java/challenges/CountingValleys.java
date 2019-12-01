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

    public void countingValleysGraph(int n, String s) {
        char[] hikeSteps = s.toCharArray();
        int elevation = 0;
        char[][] graph = new char[n][n];
        char graphGlyph;
        int graphMiddle = n / 2;

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = ' ';
                if (j == graphMiddle) {
                    graph[i][j] = '-';
                }
            }
        }

        for (int i = 0; i < n; i++) {

            graphGlyph = hikeSteps[i] == 'U' ? '/' : '\\';
            elevation += hikeSteps[i] == 'U' ? 1 : -1;
            graph[i][graphMiddle + (elevation * -1)] = graphGlyph;
        }

        System.out.println("-----------------------");
        for (int j = 0; j < graph[0].length; j++) {
            for (int i = 0; i < graph.length; i++) {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------");


    }


}
