import java.util.Scanner;

public class BOJ_2609_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = max(a,b);
        System.out.println(gcd);
        System.out.println(min(a,b,gcd));
    }
    // 유클리드 호제법
    private static int max(int a, int b){
        if (a % b ==0){
            return(b);
        }
        return max(b,a%b);
    }
    private static int min(int a, int b, int gcd){
        return (a/gcd)*(b/gcd)*gcd;
    }
}
