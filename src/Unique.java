import java.util.Scanner;

public class Unique {
    public static boolean hasUniqueChars(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }
        boolean[] table = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            if (table[input.charAt(i)]) {
                return false;
            } else {
                table[input.charAt(i)] = true;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(hasUniqueChars(s));
    }
}
