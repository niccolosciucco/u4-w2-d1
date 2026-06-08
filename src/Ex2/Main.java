package Ex2;

import Ex2.exceptions.DividedByZeroException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserire il numero di km percorsi");
            double km = Double.parseDouble(scanner.nextLine());
            if (km <= 0) {
                throw new DividedByZeroException("Inserire un numero di km valido");
            }

            System.out.println("Inserire i litri consumati");
            double litri = Double.parseDouble(scanner.nextLine());
            if (litri == 0) {
                throw new DividedByZeroException("Inseriri un numero di litri valido");
            }
            System.out.println("Il rapporto km/litro è: " + km / litri);

        } catch (DividedByZeroException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
