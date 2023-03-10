import java.util.Scanner;

public class RunningSumOf1DArray {

    static int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            runningsum[i] = sum;
        }

        return runningsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = runningSum(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        sc.close();
    }

}