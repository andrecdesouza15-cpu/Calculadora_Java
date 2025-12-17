package calculadora;

public class Subtracao extends Calculadora {
    double minuendo;
    double subtraendo;

    public Subtracao(double minuendo, double subtraendo) {
        this.minuendo = minuendo;
        this.subtraendo = subtraendo;
    }

    @Override
    public double calcular() { //Funcao que efetua a subtracao
        resultado = minuendo - subtraendo;
        return resultado;
    }

    @Override
    public void info() {
        System.out.println("Subtração: " + minuendo + " - " + subtraendo + " = " + resultado);
    }
}