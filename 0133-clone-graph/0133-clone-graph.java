class Solution {
    public Node cloneGraph(Node node) {

        if(node==null)return null;

        HashMap<Node,Node> visited=new HashMap<>();
        Queue<Node> q = new ArrayDeque<>();

        visited.put(node,new Node(node.val,new ArrayList<>()));
        q.offer(node);

        while (!q.isEmpty()) {
            Node nd=q.poll();
            
            for(Node neighbors:nd.neighbors){
                if(!visited.containsKey(neighbors)){

                    visited.put(neighbors,new Node(neighbors.val,new ArrayList<>()));
                    q.offer(neighbors);
                }

                visited.get(nd).neighbors.add(visited.get(neighbors));
            }
        }
        return visited.get(node);
    }
}