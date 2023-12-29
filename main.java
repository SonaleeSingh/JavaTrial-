
    import java.util.Scanner;

public class main {
    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to calculate the sum of numbers at prime indices
    public static int SumPrimeIndices(int[] arr, int n) {
        if (arr == null || n == 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = SumPrimeIndices(arr, n);
        System.out.println(result);
    }
}


