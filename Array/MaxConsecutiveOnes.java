package Array;

class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int count  = 0;
        int maxCount = 0;
        //int i = 0
        //while(i < nums.length)
        //{
        // if(nums[i] == 1)
        //  count++;
        //  if(count > maxCount)
        //  maxCount = count;
        // else {count = 0};
        // i++;
        //}
        // return maxCount;
        for(int num : nums)
        {
            if(num == 1)
            {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            else
            {
                count = 0;
            }
        }
        return maxCount;
    }
}

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] num = {1, 0, 1, 1, 1, 1, 0, 1};
        Solution obj = new Solution();
        int result = obj.findMaxConsecutiveOnes(num);
        System.out.println(result);
    }
}
