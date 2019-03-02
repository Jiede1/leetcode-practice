class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        int nonZeroIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(zeroIndex<0)zeroIndex = i;
                while(nums[zeroIndex]!=0){   //如果没有等于0，+1
                    zeroIndex++;
                }
            }else {
                nonZeroIndex =i;
                if(zeroIndex>=0 && nonZeroIndex>zeroIndex){
                    nums[zeroIndex] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = 0;
                    zeroIndex++;  //每次更新只加1
                }
            }
        }
    }
}