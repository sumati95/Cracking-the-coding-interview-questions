import java.util.Scanner;

public class ReverseString {
    static void swap (String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        char temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        swap(s);
    }
}
