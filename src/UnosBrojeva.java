import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UnosBrojeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> brojevi = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Unesi cijeli broj");
            System.out.println("2. Zavrsi unos i prikazi najveci i najmanji broj");
            System.out.print("Odabir: ");
            int opcija = scanner.nextInt();
            scanner.nextLine();
            if (opcija == 1) {
                System.out.print("Unesi cijeli broj: ");
                int broj = scanner.nextInt();
                scanner.nextLine();
                brojevi.add(broj);
            } else if (opcija == 2) {
                break;
            } else {
                System.out.println("Nepoznata opcija, pokusaj ponovno.");
            }
        }
        if (brojevi.isEmpty()) {
            System.out.println("Nema unesenih brojeva.");
        } else {
            int min = Collections.min(brojevi);
            int max = Collections.max(brojevi);

            System.out.println("Najmanji uneseni broj: " + min);
            System.out.println("Najveci uneseni broj: " + max);
        }
        scanner.close();
    }
}
