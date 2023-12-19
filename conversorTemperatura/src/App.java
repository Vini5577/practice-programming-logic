import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os graus em Celsius: ");
        Double celcius = sc.nextDouble();

        Double fahrenheit = celcius * 1.8 + 32;

        System.out.println("O valor em Fahrenheit é " + fahrenheit);

        sc.close();
    }
}
