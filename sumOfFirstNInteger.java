import java.util.*;

public class SumOfFirstNInteger {

    public static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return sum(n - 1) + n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int ans = sum(n);

        System.out.println("Sum = " + ans);
    }
}