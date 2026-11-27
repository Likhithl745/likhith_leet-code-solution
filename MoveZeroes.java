import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int next=0; for(int x:nums) if(x!=0) nums[next++]=x;
        while(next<nums.length) nums[next++]=0;
    }
}
