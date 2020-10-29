import java.util.Arrays;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];

        for(int i=0;i<n;i++){
            ns[i] = sc.nextInt();

        }

        sc.close();
        Arrays.sort(ns);
        System.out.println(ns[0] + " " + ns[n-1]);


    }
}
