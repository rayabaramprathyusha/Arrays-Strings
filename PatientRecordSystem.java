import java.util.Scanner;

public  class PatientRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Patients:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names=new String[n];
        int[] ages=new int[n];
        String[] diseases=new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Name:");
            names[i]=sc.nextLine();
            System.out.println("Enter Age:");
            ages[i]=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Disease");
            diseases[i]=sc.nextLine();
        }
        System.out.println("\n ----Patient Record System ----\n");
        for(int i=0;i<n;i++){
            System.out.println("Name:"+names[i]+"\tAge:"+ages[i]+"\tDisease:"+diseases[i]);
        }
        sc.close();
    }
}