import java.util.Scanner;

public class Prime2 {
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
        int count = 0;
        int i = 2;
        do{
            if(i == 2){
                System.out.println(i);
                count++;
            }
            else if(isPrime(i))
            {
                System.out.println(i);
                count++;
            }
            i++;
        }while(count < num);



    }
}
