public class App {
    public static void main(String[] args) throws Exception {

        int soma = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                soma += i;
                System.out.println(i);
            }
        }

        System.out.println("Soma dos 10 primeiros números impares: " +  soma);
    }
}
