class Solution {
    public int kthSmallest(int[][] mat, int k){
        int n = mat.length;
        int l = mat[0][0],h = mat[n - 1][n - 1],ans = -1;
        while(l <= h){
            int mid = (h - l) / 2 + l;
            if(check(mat,mid,k)){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    private boolean check(int[][]mat,int ele,int k){
        int cnt = 0;
        int i = mat.length - 1,j = 0;
        while(i >= 0 && j < mat[0].length){
            if(mat[i][j] <= ele){
                cnt += (i + 1);
                j++;
            }
            else{ 
                i--;
            }
        }
        return cnt >= k;
    }
}