import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                cont++;
            }
        }

        String ePrimo = cont == 2 ? "é primo" : "não é primo";

        System.out.println("O número " + n + " " + ePrimo);

        sc.close();
    }
}
