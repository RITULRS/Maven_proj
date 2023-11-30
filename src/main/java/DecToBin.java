import java.util.Scanner;

public class DecToBin {
        public static void DecToBinFun(int input){
            String res = "";
            while(input > 0){
                res += input%2;
                input /= 2;
                }
            StringBuilder sb = new StringBuilder(res);
            sb = sb.reverse();

            System.out.println(sb);
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a decimal no: ");
        int input = s.nextInt();
        DecToBinFun(input);
    }
}
