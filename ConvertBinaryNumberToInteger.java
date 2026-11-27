import java.util.*;

class Solution {
    public int binaryToDecimal(String binary) {
        int value=0;
        for(int i=0;i<binary.length();i++)
            value=value*2+(binary.charAt(i)-'0');
        return value;
    }
}
