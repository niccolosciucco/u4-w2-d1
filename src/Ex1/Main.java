package Ex1;

import Ex1.exceptions.OutOfIndexException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        byte giri = 0;
        while (giri < 5) {
            int randomNum = (int) (Math.random() * 11);
            array[giri] = randomNum;

            giri++;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero tra 1 e 10. Per terminare, inserire 0");
        int input = Byte.parseByte(scanner.nextLine());

        while (input != 0) {
            System.out.println("In quale posizione vuoi aggiungerlo?");
            int index = Integer.parseInt(scanner.nextLine());

            try {
                if (index < 0 || index >= array.length) {
                    throw new OutOfIndexException("Indice " + index + " non valido per un array di lunghezza " + array.length);
                } else if (input < 1 || input > 10) {
                    throw new OutOfIndexException(("Numero inserito troppo grande. Inserire un numero da 1 a 10"));
                }
                array[index] = input;
            } catch (OutOfIndexException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Inserisci un numero tra 1 e 10. Per terminare, inserire 0");
            input = Byte.parseByte(scanner.nextLine());
        }
    }
}
