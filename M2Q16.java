import java.util.Scanner;
/**
 * M2Q16
 */
public class M2Q16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
        int a;    
        a = (int)Math.pow(2, i);
        sum = sum +a;
     }
        System.out.print(sum);
    }
}