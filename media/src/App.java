import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        Double n1;
        Double n2;
        Double n3;
        Double media;
        String status;

        System.out.print("Digite a nota da N1: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a nota da N2: ");
        n2 = sc.nextDouble();
        System.out.print("Digite a nota da N3: ");
        n3 = sc.nextDouble();

        Boolean dezMais = n1 > 10 || n2 > 10 || n3 > 10;
        Boolean valorNegativo = n1 < 0 || n2 < 0 || n3 < 0;

        if (dezMais || valorNegativo) {
            sc.close();
            throw new RuntimeException("Só é aceito notas de 0 a 10");
        }

        media = (n1 + n2 + n3) / 3;
        status = media >= 7 ? "Aprovado" : "Reprovado";

        System.out.printf("Sua média é:  %.1f \n", media);
        System.out.println("Você está: " + status);

        sc.close();
    }
}
