import java.util.Scanner;

public class Black {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] chars = a.toCharArray();

        int length = 0;

    
        while (true) {
            if (length >= chars.length) break;
            char c = chars[length];
            if (c >= '0' && c <= '9') {
                System.out.println("invalid input");
                return;
            }
            length++;
        }
        if (length < 3) {
            System.out.println("invalid input");
            return;
        }
        char firstChar = toUpper(chars[0]);
        char lastChar = toUpper(chars[length - 1]);
        if (!((firstChar == 'B' || firstChar == 'L') && (lastChar == 'E' || lastChar == 'R'))) {
            System.out.println("no");
            return;
        }
        boolean hasK = false;
        for (int i = 1; i < length - 1; i++) {
            if (toUpper(chars[i]) == 'K') {
                hasK = true;
                break;
            }
        }
        if (hasK) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static char toUpper(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char)(c - 32);
        }
        return c;
    }
}
