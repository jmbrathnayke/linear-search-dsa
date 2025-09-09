public class Main {
    public static void main(String[] args) {

        // Initialize an array of integers
        int[] nums = {3, 5, 7, 11, 13};

        // Define the target element to search for
        int target = 11;

        // Call linearSearch method and store the result (index of target or -1)
       // int result = linearSearch(nums, target);
        int result = binarySearch(nums,target);

        // Check if the element was found and print appropriate message
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }


    private static int linearSearch(int[] nums, int target) {

        // Loop through each element of the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element matches the target, return its index
            if (nums[i] == target)
                return i;
        }

        // If target is not found, return -1
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {

        //3, 5, 7, 11, 13
        //starting and ending point
        int left = 0;
        int right = nums.length-1;

        //check condition
        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] == target){
               return mid; //index
            } else if (nums[mid] < target) {
                //shift left
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        // If target is not found, return -1
        return -1;
    }
}
