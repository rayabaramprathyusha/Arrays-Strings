import java.util.Scanner;

public class ProductSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] Products={"Laptop","Phone","Tablet","Headphone","Shoes"};
        System.out.print("Enter Product Name to search: ");
        String search=sc.nextLine();

        boolean found=false;
        for(String product:Products){
            if(product.equalsIgnoreCase(search)){
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("Product Not Found");
        }
        else{
            System.out.println("Product Found");
        }
        sc.close();
    }
}