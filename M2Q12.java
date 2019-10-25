import java.util.Scanner;
/**
 * M2Q12
 */
public class M2Q12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char c = scn.next().charAt(0);
        for(int i= 1;i<=n;i++){
            for(int x=1;x<=n;x++){    
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
}