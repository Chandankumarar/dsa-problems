class Solution {
    List<Integer>[] graph;
    boolean[] visited;

    int vertices;
    int degreesum;

    public int countCompleteComponents(int n, int[][] edges) {
        graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        visited=new boolean[n];
        int answer=0;
        for(int i=0;i<n;i++){
            vertices=0;
            degreesum=0;
            if(!visited[i]){
                dfs(i);
                int actualedges=degreesum/2;
                int requirededges=vertices*(vertices-1)/2;
                if(actualedges==requirededges){
                    answer++;
                }
            }
        }
        return answer;
    }
     void dfs(int node){
            visited[node]=true;
            vertices++;
            degreesum+=graph[node].size();
            for(int neigh:graph[node]){
                if(!visited[neigh]){
                    dfs(neigh);
                }
            }
    }
}