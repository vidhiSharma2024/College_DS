import java.util.Scanner;

public class ReverseArray {

    static int[] reverseArray(int[] arr) {
        int p = 0, q = arr.length - 1, temp;
        while (p < q) {
            temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rev_arr = reverseArray(arr);

        System.out.print("Reversed Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rev_arr[i] + " ");
        }

        sc.close();
    }

}