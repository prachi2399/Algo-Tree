public class topologicalSort{
    public class Edge{
        int v;
        int w;
        Edge(int v, int w){
            this.v=v;
            this.w=w;
        }
    }
    int N=7;
    int[] par=new int[N];
    int[] size=new int[N];

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }

    public static void display(int N, ArrayList<Edge>[] graph) {
        for (int i = 0; i < N; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.v + ", " + e.w + ") ");
            }
            System.out.println();
        }
    }

}