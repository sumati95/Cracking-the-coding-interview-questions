import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(compress(s));
    }

     static String compress(String str) {
        int count = 0;
        String compressstring = " ";
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressstring += "" + str.charAt(i) + count;
                count = 0;
            }
        }
        return compressstring.length() < str.length() ? compressstring : str;
    }
}
