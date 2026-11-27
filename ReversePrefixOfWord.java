import java.util.*;

class Solution {
    public String reversePrefix(String word,char ch) {
        int end=word.indexOf(ch);
        if(end==-1) return word;
        char[] a=word.toCharArray();
        int l=0,r=end;
        while(l<r) { char t=a[l]; a[l]=a[r]; a[r]=t; l++; r--; }
        return new String(a);
    }
}
