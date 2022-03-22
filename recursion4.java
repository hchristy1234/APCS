public class recursion4 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 3};
        System.out.println(groupSum(0, a, 9));

        int[] b = {2, 4, 2};
        System.out.println(split53(b));

        int[] c = {5, 2, 3};
        System.out.println(splitArray(c));
    }
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (groupSum(start+1, nums, target - nums[start])) {
                return true;
            }
            if (groupSum(start+1, nums, target)) {
                return true;
            }
        }
        return false;
        // keep subtracting from target until it gets perfectly to 0 (aka there's numbers that add up to target)
        // otherwise, try it from a different start value until start gets too big ...
        // basically it ends up going thru a ton of combos ... since it has one with skipping the "start" value and one without skipping the "start" value for every time
    }

    public static boolean split53(int[] nums) {
        return split53Helper(0, 0, nums);
    }
    public static boolean split53Helper(int start, int target, int[] nums) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (nums[start] % 5 == 0) {
                return split53Helper(start+1, target + nums[start], nums);
            }
            else if (nums[start] % 3 == 0) {
                return split53Helper(start+1, target - nums[start], nums);
            }
            else if (split53Helper(start+1, target + nums[start], nums)) {
                return true;
            }
            else if (split53Helper(start+1, target - nums[start], nums)) {
                return true;
            }
        }
        return false;
    }

    public static boolean splitArray(int[] nums) {
        return splitArrayHelper(0, 0, nums);
    }
    public static boolean splitArrayHelper(int start, int target, int[] nums) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (splitArrayHelper(start+1, target + nums[start], nums)) {
                return true;
            }
            if (splitArrayHelper(start+1, target - nums[start], nums)) {
                return true;
            }
        }
        return false;
    }
}
