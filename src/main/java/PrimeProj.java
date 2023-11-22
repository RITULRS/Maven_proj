import java.util.Scanner;
public class PrimeProj {
    public static boolean isPrime(int num){
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i == 1 || i == 2) {
                System.out.println(i);
            }
            else if(isPrime(i))
                System.out.println(i);
        }


    }
}
