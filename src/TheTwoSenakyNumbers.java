public class TheTwoSenakyNumbers {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 2, 3}; // Nümunə array
        findDuplicates(nums);
    }

    public static void findDuplicates(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num] < 0) {
                System.out.println(num);
            } else {
                nums[num] = -nums[num];
            }
        }
    }
}
