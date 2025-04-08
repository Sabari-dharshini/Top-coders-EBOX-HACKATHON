import java.util.*;

public class WordGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        while (true) {
            String s = sc.next();
            if (s.charAt(0) == '#')
                break;
            else
                str.append(s).append(" ");
        }

        String arr[] = str.toString().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else if (arr[i - 1].charAt(arr[i - 1].length() - 1) == arr[i].charAt(0)) {
                System.out.println(" " + arr[i]);
            } else {
                break;
            }
        }
    }
}
