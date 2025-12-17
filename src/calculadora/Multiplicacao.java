package calculadora;

public class Multiplicacao extends Calculadora {
    double fator1;
    double fator2;

    public Multiplicacao(double fator1, double fator2) {
        this.fator1 = fator1;
        this.fator2 = fator2;
    }

    @Override
    public double calcular() { //Funcao que efetua a multiplicacao
        resultado = fator1 * fator2;
        return resultado;
    }

    @Override
    public void info() {
        System.out.println("Multiplicação: " + fator1 + " * " + fator2 + " = " + resultado);
    }
}