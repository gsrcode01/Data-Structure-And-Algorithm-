import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        n = Math.abs(n); // Handles negative numbers

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println(count);
    }
}