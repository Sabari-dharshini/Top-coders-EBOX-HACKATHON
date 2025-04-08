import java.util.Scanner;

public class ChessStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter board size n: ");
        int n = sc.nextInt();

        System.out.print("Enter bishop position (bx by): ");
        int bx = sc.nextInt();
        int by = sc.nextInt();

        System.out.print("Enter queen position (qx qy): ");
        int qx = sc.nextInt();
        int qy = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == bx && j == by) {
                    System.out.print("B ");
                } else if (i == qx && j == qy) {
                    System.out.print("Q ");
                } else {
                    boolean bishopAttack = (i - bx) * (i - bx) == (j - by) * (j - by);
                    boolean queenAttack = (i == qx || j == qy || (i - qx) * (i - qx) == (j - qy) * (j - qy));

                    if (bishopAttack && queenAttack) {
                        System.out.print("% ");
                    } else if (bishopAttack) {
                        System.out.print("* ");
                    } else if (queenAttack) {
                        System.out.print("@ ");
                    } else {
                        System.out.print(". ");
                    }
                }
            }
            System.out.println();
        }
    }
}
