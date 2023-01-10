
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int max = nums.get(0);
        int second = nums.get(1);
        for(int i : nums){
            if(i > max){
                second = max;
                max = i;
            }else if(i > second){
                second = i;
            }
        }
        return second + max;
    }
}