import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        class Solution {

            static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            public static int solve(boolean[][] graph, int n) {
                int count=0;
                for(int i=0;i<graph.length;i++) {
                    for(int j=0;j<graph.length;j++) {
                        if(graph[i][j]) {

                            for(int k=0;k<graph.length;k++) {

                                if(k!=i && graph[k][j]==true && graph[i][k] ==true ) {
                                    count++;
                                }


                            }

                        }
                    }
                }
                return count/6; //here we are doing count/6, because we are not using visited array,
                //so 1 cycle is counted 2 times for each of the three vertices, one in clockwise one in anti clockwise

            }

            public static boolean[][] takeInput() throws IOException, IOException {
                String[] strNums;
                strNums = br.readLine().split("\\s");
                int n = Integer.parseInt(strNums[0]);
                int m = Integer.parseInt(strNums[1]);

                boolean[][] graphs = new boolean[n][n];
                int firstvertex, secondvertex;

                for (int i = 0; i < m; i++) {
                    String[] strNums1;
                    strNums1 = br.readLine().split("\\s");
                    firstvertex = Integer.parseInt(strNums1[0]);
                    secondvertex = Integer.parseInt(strNums1[1]);
                    graphs[firstvertex][secondvertex] = true;
                    graphs[secondvertex][firstvertex] = true;
                }
                return graphs;
            }

            public static void main(String[] args) throws NumberFormatException, IOException {
                boolean[][] graphs = takeInput();

                int ans = solve(graphs, graphs.length);
                System.out.println(ans);

            }
        }
    }
}