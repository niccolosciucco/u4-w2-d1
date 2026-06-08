package Ex3.entities;

import Ex3.exceptions.BancaException;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;

        if (saldo < 0) {
            nMovimenti++;
            throw new BancaException("Il conto è in rosso");
        }
        nMovimenti++;
    }
}