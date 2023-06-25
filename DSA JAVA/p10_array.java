//two sum problem
  
public class p10_array {       

    
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(target == nums[i] + nums[j]) {
                    return new int[] {i, j};  
                }
            }
        }
        return new int[] {-1, -1};
    }
}
