import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String lowStr = "" + low;
        int start = lowStr.charAt(0) - '0';

        for(int i = 1; i < 10; i++){
            backtrack(result, low, high, i);
        }

        Collections.sort(result);
        return result;
    }
    private void backtrack(List<Integer> result, int low, int high, int start){
        if(start > high){
            return;
        }

        if(start % 10 != 9){
            int next = start * 10 + start % 10 + 1;
            if(next >= low && next <= high){
                result.add(next);
            }
            backtrack(result, low, high, next);
        }

    }
}