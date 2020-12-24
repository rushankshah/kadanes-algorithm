import java.util.Scanner;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        System.out.println("Enter the number of values in array: \n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i : arr) {
            max_ending_here = max_ending_here + i;
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if(max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(("Maximum sequence in array is "+max_so_far));
        sc.close();
    }
}
