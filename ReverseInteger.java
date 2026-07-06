import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        if (n < 0) {
            n = Math.abs(n);
        }

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }

        if (temp < 0) {
            rev = -rev;
        }

        System.out.println(rev);
    }
}