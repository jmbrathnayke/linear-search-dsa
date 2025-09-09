public class Main {
    public static void main(String[] args) {

        int[] nums = {3, 5, 7, 11, 13};
        int target = 11;

        int result = linearSearch(nums, target);

        if (result != -1)
            System.out.println("Element found at index:" + result);
        else
            System.out.println("Element not found");
        }

        private static int linearSearch ( int[] nums, int target){

            //for search
            for (int i=0;i<nums.length; i++){
                if (nums[i] == target)
                    return i;
            }

            return -1;

        }
    }
