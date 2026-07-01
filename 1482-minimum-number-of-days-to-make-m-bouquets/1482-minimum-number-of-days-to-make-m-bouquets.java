class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l = 1,h = 1000000000,min = -1;
        while(l <= h){
            int mid = (h - l) / 2 + l;
            if(check(mid,bloomDay,m,k)){
                h = mid - 1;
                min = mid;
            }
            else{
                l = mid + 1;
            }
        }
    return min;
    }

    private boolean check(int mid,int[] arr,int m,int k){
        int left = 0,right = 0,cnt = 0;
        while(right < arr.length && cnt < m){
            if(arr[right] > mid || right - left + 1 == k){
                left = right + 1;
                cnt  = arr[right] > mid ? cnt : cnt + 1;
            }
            right++;
        }
        return cnt == m;
    }
}