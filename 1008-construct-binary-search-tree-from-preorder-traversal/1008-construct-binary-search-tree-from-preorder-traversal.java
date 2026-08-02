class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<n;i++){
          TreeNode node=new TreeNode(preorder[i]);
         
          dfs(node,root);
        }
        return root;
    }
    public void dfs(TreeNode node,TreeNode root){  
       if(node.val<root.val){
        if(root.left==null){
            root.left=node;
        }
        else
         dfs(node,root.left);

       }
       if(node.val>root.val){
        if(root.right==null)
        root.right=node;
        else
        dfs(node,root.right);
       }
    }
}