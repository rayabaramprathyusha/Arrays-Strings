import java.util.Scanner;

public class StockPriceAnalyzer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n=sc.nextInt();
        int[] prices=new int[n];


        System.out.print("Enter stock prices: ");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();

        }
        int max=prices[0],min=prices[0];
        for(int price:prices){
            if(price>max) max=price;
            if(price<min) min=price;
        }
        System.out.println("Maximum stock price is "+max);
        System.out.println("Minimum stock price is "+min);

        sc.close();

    }
}
