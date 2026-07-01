class BrowserHistory {
    class Node {
        String url;
        Node next, prev;

        Node(String url) {
            this.url = url;
        }
    }

    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node np = new Node(url);
        // Splice the new page directly after current node, clearing forward history ✂️
        curr.next = np;
        np.prev = curr;
        curr = np; // Advance active position to the new page
    }
    
    public String back(int steps) {
        // Traverse backward until we hit historical limits or use up steps ⬅️
        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        // Traverse forward until we hit the newest record or use up steps ➡️
        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */