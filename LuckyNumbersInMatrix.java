import java.util.*;

import java.util.*;
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        for(int r=0;r<matrix.length;r++) {
            int minCol=0;
            for(int c=1;c<matrix[r].length;c++)
                if(matrix[r][c]<matrix[r][minCol]) minCol=c;
            int value=matrix[r][minCol]; boolean largest=true;
            for(int i=0;i<matrix.length;i++)
                if(matrix[i][minCol]>value) largest=false;
            if(largest) result.add(value);
        }
        return result;
    }
}
