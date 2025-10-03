import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of  Transactions:");
        int n = sc.nextInt();
        int[] transactions = new int[n];

        System.out.println("Enter transactions amounts:");
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }
        Arrays.sort(transactions);

        System.out.println("Enter k(for kth smallest transaction):");
        int k = sc.nextInt();

        if(k>0 && k<n){
            System.out.print("The" +k+" smallest transaction is"+transactions[k-1]);
        }else{
            System.out.print("Invalid k value");
        }
        sc.close();
    }
}