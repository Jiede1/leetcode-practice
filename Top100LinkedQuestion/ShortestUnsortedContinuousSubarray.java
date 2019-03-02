class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int flagi=0;
        int flagj=0;
        while(i!=j){
            for(int k=i+1;k<=j;k++){
                if(nums[i]>nums[k]){
                    flagi=1;
                    break;
                }
            }
            for(int k=j;k>=i;k--){
                if(nums[j]<nums[k]){
                    flagj=1;
                    break;
                }
            }
            if(flagi==1 && flagj==1)break;
            if(flagi==0){
                i++;
                if(i==j)break;
            }
            if(flagj==0){
                j--;
                if(i==j)break;
            }
            flagi=0;
            flagj=0;
        }
        return i==j?0:j-i+1;
    } 
}