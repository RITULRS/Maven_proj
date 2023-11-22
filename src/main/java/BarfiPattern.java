import java.util.Scanner;

public class BarfiPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int star = 1;
        for(int i = 0; i <= n/2; i++){
            for(int s = 0; s < n/2-i; s++){
                System.out.print(" ");
            }

            for(int a = 0; a < star; a++){
                System.out.print("*");
            }
            star += 2;

            System.out.println();
        }
         star -= 4;
        for(int i = 0; i < n/2; i++){
            for(int s = 0; s <= i; s++) {
                System.out.print(" ");
                }

            for(int a = 0; a < star; a++){
                System.out.print("*");
            }
            star -= 2;

            System.out.println();
        }
    }
}
