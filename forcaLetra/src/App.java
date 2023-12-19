import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int leftLimt = 97;
        int rightLimit = 122;
        int targetStringLength = 1;
        Random random = new Random();

        String generaString = random.ints(leftLimt, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println("===== FORCA COM UMA LETRA =====");
        System.out.println("Computador: - Em que letra estou pensando? ");
        String letter = sc.next();

        if (letter.equalsIgnoreCase(generaString)) {
            System.out.println("ACERTOOOUUU!!!!!!!:)");
            System.out.println("A letra que eu pensei é: " + generaString);
        } else {
            System.out.println("Poxa, não foi dessa vez tente de novo!!:(");
            System.out.println("A letra que eu pensei é: " + generaString);
        }

        sc.close();
    }
}
