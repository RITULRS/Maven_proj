import java.util.Scanner;

public class Recursion1toN {
    public static void rec(int s,int n){
        if(s > n)
            return;

        System.out.println(s);
        rec(++s,n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        rec(0,n);
    }
}
