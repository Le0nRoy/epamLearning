import java.util.Arrays;

public class MyArrays {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 | nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length < 1 || nums[0] != nums[nums.length - 1]) {
            return false;
        }
        return true;
    }

    public int[] makePi() {
        int[] res = new int[]{3, 1, 4};
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] != b[0] & a[a.length - 1] != b[b.length - 1]) {
            return false;
        }
        return true;
    }

    public int sum3(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }

    public int[] rotateLeft3(int[] nums) {
        int buf = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = buf;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length / 2; i++) {
            int buf = nums[length - 1 - i];
            nums[length - 1 - i] = nums[i];
            nums[i] = buf;
        }
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        max = Math.max(max, nums[1]);
        Arrays.fill(nums, max);
        return nums;
    }

    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length < 2) {
            for (int val : nums) {
                sum += val;
            }
        } else {
            for (int i = 0; i < 2; i++)
                sum += nums[i];
        }
        return sum;
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[a.length / 2], b[b.length / 2]};
    }

}
