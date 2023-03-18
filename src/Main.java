import java.util.Scanner;

public class Main {
    static boolean isSorted(double[] numbers, int count) {
        for (int i=1; i < count; i++) {
            if (numbers[i] < numbers[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // - Läs in tal och lagra i en array (double)
        // - Skapa en metod som tar en array som parameter och som returnerar
        //   ifall arrayen är sorterad eller ej (boolean)

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[100];
        int count = 0;

        System.out.println("Skriv in talen:");
        while(input.hasNextDouble()) {
            numbers[count] = input.nextDouble();
            count++;
        }

        if (isSorted(numbers, count)) {
            System.out.println("Talen är i stigande ordning");
        } else {
            System.out.println("Talen är inte i stigande ordning");
        }
    }
}