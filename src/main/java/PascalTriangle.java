import java.util.Scanner;
public class PascalTriangle {
    public static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        int fact = 1;
        for(int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("For row no "+n);
       // System.out.println(factorial(r));
        for(int r = 0; r <= n; r++){
            int ans = factorial(n)/(factorial(n-r)*factorial(r));
            System.out.print(ans+" ");
        }
    }
}
