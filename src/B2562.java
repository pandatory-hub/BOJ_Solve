import java.util.Scanner;

public class B2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for(int i=0;i<9;i++) {
            int a = sc.nextInt();
            if(a>max){
                max = a;
                index = i+1;
            }
        }

        sc.close();
        System.out.println(max);
        System.out.println(index);

    }
}
