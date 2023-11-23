import java.util.Scanner;

public class Pascal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space <= n - row; space++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int i = 1; i <= row; i++) {
                System.out.print(C + " ");
                C = C * (row - i) / i;
            }
            System.out.println();
        }
    }

}
