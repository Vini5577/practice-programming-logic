import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        String parImpar = n % 2 == 0 ? "par" : "impar";

        System.out.println("O número " + n + " é " + parImpar);

        sc.close();
    }
}
