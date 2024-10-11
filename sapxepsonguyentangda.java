import java.util.Arrays;
import java.util.Scanner;
public class sapxepsonguyentangda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ta co mot day co : ");
        int n = scanner.nextInt();
        System.out.println("chu so");

        int[] a = new int[n];
        System.out.println("bao gom cac so sau6:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println("cac so theo thu tu tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

    

