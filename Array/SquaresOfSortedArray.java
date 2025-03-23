package Array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int nums[] = {-4, -1, 0, 3, 10};
        int[] result = findSquaresofSortedArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findSquaresofSortedArray(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            int temp = nums[i];
            nums[i] = temp * temp; 
        }
        Arrays.sort(nums);
        return nums;
    }
}
