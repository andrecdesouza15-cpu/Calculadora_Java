package calculadora;

public class Adicao extends Calculadora {
    double parcela1;
    double parcela2;

    public Adicao(double parcela1, double parcela2) {
        this.parcela1 = parcela1;
        this.parcela2 = parcela2;
    }

    @Override
    public double calcular() { //Funcao que efetua a adicao das duas parcelas
        resultado = parcela1 + parcela2;
        return resultado;
    }

    @Override
    public void info() {
        System.out.println("Adição: " + parcela1 + " + " + parcela2 + " = " + resultado);
    }
}