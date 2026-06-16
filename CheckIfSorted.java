import java.util.*;

class CheckIfSorted {
    public boolean isSorted(ArrayList<Integer> nums) {
        ArrayList<Integer> sorted = new ArrayList<>(nums);
        Collections.sort(sorted);
        return nums.equals(sorted);
    }
}
