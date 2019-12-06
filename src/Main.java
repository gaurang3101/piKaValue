import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number of terms - ");
        int numberOfTerms = sc.nextInt();
        PiKaValue pkv = new PiKaValue(numberOfTerms);
        pkv.piKaValueKyaHai();
    }
}
