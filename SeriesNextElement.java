import java.util.Scanner;

public class SeriesNextElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String[] parts = a.split(",");
        int[] s = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            s[i] = Integer.parseInt(parts[i].trim());
        }

        int diff = s[1] - s[0];
        boolean Arithmetic = true;

        for (int i = 2; i < s.length; i++) {
            int currentDiff = s[i] - s[i - 1];
            if (currentDiff == diff) {
            } else {
                Arithmetic = false;
            }
        }
        if (Arithmetic == true) {
            int next = s[s.length - 1] + diff;
            System.out.println(next);
            return;
        }
        boolean Geometric = true;
        int ratio = s[1] / s[0];

        for (int i = 2; i < s.length; i++) {
            int currentRatio = s[i] / s[i - 1];
            int remainder = s[i] % s[i - 1];

            if (currentRatio == ratio && remainder == 0) {
            } else {
                Geometric = false;
            }
        }

        if (Geometric == true) {
            int next = s[s.length - 1] * ratio;
            System.out.println(next);
            return;
        }
        System.out.println("Invalid or unsupported series");
    }
}
