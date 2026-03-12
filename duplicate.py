class Solution(object):
    def containsNearbyDuplicate(self, nums, k,n):
        for i in range (n):
            for j in range(i+1,n):
                if nums[i]==nums[j] and abs(i-j)<=k:
                    return True
        return False