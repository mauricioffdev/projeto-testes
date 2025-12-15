package entidades;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public double calcularJurosSimples(double capital, double taxa, int tempo) {
        return capital * taxa * tempo;
    }

    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public double dividir(double a, double b) {
        // Se dividir por zero, lançamos um erro proposital
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;

    }
}