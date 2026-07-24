class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums=new int[]{1,2,3,4,5,6,7,8,9};
        generate(nums,0,k,n,new ArrayList<>(),0);
        return res;
    }
    public void generate(int[] nums,int index,int size,int target,List<Integer> list,int sum){
        if(list.size()==size && sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        if(index>=nums.length || sum>target) return;
        list.add(nums[index]);
        generate(nums,index+1,size,target,list,sum+nums[index]);
        list.remove(list.size()-1);
        generate(nums,index+1,size,target,list,sum);
    }
}