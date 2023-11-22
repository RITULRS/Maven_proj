import java.util.Scanner;
public class Fib1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 1 || n == 2)
        {
            System.out.println("1");
            System.exit(0);
        }
        int fir = 1;
        int sec = 1;
        int fib = fir+sec;
        System.out.println(fir);
        System.out.println(sec);
        for(int i = 3; i <= n; i++)
        {
            System.out.println(fib);
            fir = sec;
            sec = fib;
            fib = fir+sec;

        }

    }

}
