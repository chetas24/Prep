package Mock;

public class ReArrange {
    public static void main(String[] args) {
         int[] arr = {8,3,7,1,9,4,5,2};
         System.out.println(arr.toString());
         int pivot = 5;
         reArrange(arr, pivot);
         for (int num : arr)
         {
            System.out.print(num + " ");
         }
    }

    public static void reArrange(int arr[], int pivot)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            if (arr[left] < pivot) {
                left++;
            }
            if (arr[right] >= pivot) {
                right--;
            }
            else
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

    }
}
