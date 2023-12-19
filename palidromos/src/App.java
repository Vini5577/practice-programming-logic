import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String revese = "";
        int length;

        System.out.println("Digite uma palavra: ");
        String p = sc.nextLine();

        length = p.length();

        for (int i = length - 1; i >= 0; i--) {
            revese += p.charAt(i);
        }

        if (p.equalsIgnoreCase(revese)) {
            System.out.println("Temos um palindromo");
            System.out.println("Valor digitado: " + p.toLowerCase());
            System.out.println("Valor invertido: " + revese.toLowerCase());

        } else {
            System.out.println("Não temos um palindromo");
            System.out.println("Valor digitado: " + p);
            System.out.println("Valor invertido: " + revese);
        }

        sc.close();
    }
}
