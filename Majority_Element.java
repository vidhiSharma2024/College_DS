import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Majority_Element {

    static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                count = map.get(nums[i]);
                map.put(nums[i], ++count);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > nums.length / 2) {
                System.out.println("Majority Element is : " + e.getKey());
            }
        }
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

        majorityElement(nums);
        sc.close();
    }

}
