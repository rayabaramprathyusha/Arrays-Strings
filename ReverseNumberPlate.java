import java.util.Scanner;

public class ReverseNumberPlate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Vehicle Number Plate: ");
        String plate=sc.nextLine();

        String reversed="";
        for(int i=plate.length()-1;i>=0;i--){
            reversed += plate.charAt(i);
        }
        System.out.println("Reversed Number Plate is"+reversed);
        sc.close();

    }
}