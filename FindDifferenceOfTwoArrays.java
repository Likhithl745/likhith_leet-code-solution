import java.util.*;

import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1,int[] nums2) {
        List<Integer> a=new ArrayList<>(),b=new ArrayList<>();
        for(int x:nums1) if(!has(nums2,x)&&!a.contains(x)) a.add(x);
        for(int x:nums2) if(!has(nums1,x)&&!b.contains(x)) b.add(x);
        List<List<Integer>> out=new ArrayList<>(); out.add(a); out.add(b); return out;
    }
    private boolean has(int[] arr,int x) {
        for(int n:arr) if(n==x) return true;
        return false;
    }
}
