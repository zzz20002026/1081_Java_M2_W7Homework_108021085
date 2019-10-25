import java.util.Scanner;
/**
 * M2Q15
 */
public class M2Q15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum = 0;
        double a = 1;
        for(int i=1;i<=n;i++){
            sum = sum + a / ((2*i-1)*(2*i));            
        }
        System.out.println(sum);
    }
}