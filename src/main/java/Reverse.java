import java.util.Scanner;
public class Reverse {
    public static void reverse(int input){
        int res = 0;

        while(input > 0){
            res += input%10;
            res *= 10;
            input /= 10;
        }
        res /= 10;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        reverse(input);
    }
}
