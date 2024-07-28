import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Random_Number {
    public static void main(String[] args) {
        System.out.println("Normal way to generate random numbers.");
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int random = rand.nextInt(100) + 1;
            System.out.println(random);
        }

        System.out.println();

        System.out.println("Using Math to generate random numbers.");
        for (int i = 0; i < 10; i++) {
            int randomNumber = 1 + (int) (Math.random() * 101);
            System.out.println(randomNumber);
        }

        System.out.println();

        System.out.println("Special way to generate random numbers.");
        for (int i = 0; i < 10; i++) {
            int random_number = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println(random_number);
        }

    }
}
