class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if target in nums:
            return nums.index(target)
        else:
            begin=0
            end=len(nums)-1
            while begin<=end :
                cor=(begin+end)/2
                if nums[cor]<target:
                    begin=cor+1
                else:
                    end=cor-1
            return begin