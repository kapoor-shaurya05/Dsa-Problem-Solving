class Pair {
    int color;
    int val;

    Pair(int c, int v) {
        this.color = c;
        this.val = v;
    }
}

class Solution {
    boolean bfs(int visited[], Queue<Pair> q, int[][] adj) {
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int color = pair.color;
            int root = pair.val;

            for (int i = 0; i < adj[root].length; i++) {
                int neighbour = adj[root][i];

                if (visited[neighbour] > -1) {
                    if (color == visited[neighbour]) {
                        return false;
                    }
                } else {
                    int c = (color == 1) ? 0 : 1;
                    q.offer(new Pair(c, neighbour));
                    visited[neighbour] = c;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int visited[] = new int[graph.length];
        Arrays.fill(visited, -1);
        Queue<Pair> q = new ArrayDeque<>();

        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == -1) {
                q.offer(new Pair(0, i));
                visited[i] = 0;
                if (!bfs(visited, q, graph)) {
                    return false;
                }
            }
        }
        return true;
    }
}