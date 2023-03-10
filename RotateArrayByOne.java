import java.util.Scanner;

class RotateArrayByOne {

    static int[] rotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
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

        int[] res_arr = rotateByOne(arr);
        System.out.print("After Rotate By One: ");
        for (int i = 0; i < n; i++) {
            System.out.print(res_arr[i] + " ");
        }

        sc.close();

    }

}
