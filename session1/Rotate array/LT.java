import java.util.*;

public class LT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int left = 0, right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        int pivot = left;
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            left = pivot;
            right = n - 1;
        } else {
            left = 0;
            right = pivot - 1;
        }
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(ans);
    }
}
