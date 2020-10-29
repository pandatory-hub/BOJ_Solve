import java.util.Scanner;

public class B2739 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if (a < 10) {
            for (i = 1; i < 10; i++) {
                System.out.println(a + " * " + i + " = " + a * i);
            }
        }
        else {
            System.exit(0);
        }
    }
}
