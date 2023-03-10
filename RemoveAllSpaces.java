import java.util.Scanner;

public class RemoveAllSpaces {

    static String trim(String str) {
        String trim_str = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            trim_str += str.charAt(i);
        }

        return trim_str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String res_str = trim(str);

        System.out.println("Trimmed String is: " + res_str);

        sc.close();
    }

}
