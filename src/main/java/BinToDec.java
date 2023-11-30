import java.util.Scanner;
public class BinToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String in = Integer.toString(input);
        int j = 0;
        int res = 0;
        for(int i = in.length()-1; i >= 0; i--){
            int temp =(int)Math.pow(2,j)*Integer.parseInt(in.charAt(i)+"");
            res += temp;
            j++;
         }
        System.out.println(res);
        
    }
}
