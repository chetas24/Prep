package Array;

class Problem2Solution{
    public int findEvenNumOfDigits(int[] nums)
    {
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int temp = nums[i];
            int count = 0;
            if(temp == 0)
            {
                count = 1;
            }
            else{
                while(temp > 0)
                {
                    temp = temp / 10;
                    count++;
                }
            }
            
            if (count % 2 == 0) {
                maxCount++;
            }
        }
        return maxCount;
    }
}

public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        Problem2Solution obj = new Problem2Solution();
        int result = obj.findEvenNumOfDigits(nums);
        System.out.println(result);
    }
}
