import java.util.Scanner;

public class NewsWordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter News Headline:");
        String headline = sc.nextLine();

        String[] words = headline.toLowerCase().split(" ");
        boolean[] counted = new boolean[words.length];

        System.out.println("\n Word Frequencies:");
        for(int i=0;i<words.length;i++){
            if (!counted[i]){
                int count=1;
                for(int j=i+1;j<words.length;j++){
                    if(words[j].equals(words[i])){
                        count++;
                        counted[j]=true;
                    }
                }
                System.out.println(words[i]+" "+count);
            }
        }
        sc.close();
    }
}