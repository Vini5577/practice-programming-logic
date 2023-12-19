import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int n = sc.nextInt();
        // int n = sc.nextInt();
        int fatorial = n;

        for (int i = n; i >= 1; i--) {

            if (n != 1) {
                n--;
            }

            fatorial = n * fatorial;
        }

        System.out.println("valor da fatorial é: " + fatorial);
        sc.close();
    }
}
