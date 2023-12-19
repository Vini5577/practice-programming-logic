import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        numbers.add(n1);

        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();
        numbers.add(n2);

        System.out.println("Digite mais um número: ");
        int n3 = sc.nextInt();
        numbers.add(n3);

        Collections.sort(numbers);
        System.out.println("Ordem dos números registrados: ");
        numbers.forEach(System.out::println);

        sc.close();
    }
}
