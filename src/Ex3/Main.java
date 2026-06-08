package Ex3;

import Ex3.entities.ContoCorrente;
import Ex3.entities.ContoOnLine;
import Ex3.exceptions.BancaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BancaException {
        ContoCorrente contoCorrente = new ContoCorrente("Marco", 10.45);
        ContoOnLine contoOnLine = new ContoOnLine("Marco", 200.0, 100.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire l'importo da prelevare per il tuo conto corrente");
        double preleva = scanner.nextDouble();

        System.out.println("Inserire l'importo da prelevare per il tuo conto corrente online");
        double prelevaOnline = scanner.nextDouble();

        try {
            contoCorrente.preleva(preleva);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }

        try {
            contoOnLine.preleva(prelevaOnline);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }
    }
}
