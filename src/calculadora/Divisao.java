package calculadora;

public class Divisao extends Calculadora {

    double divisor;
    double dividendo;
    double resto;

    public Divisao(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    @Override
    public double calcular() {//Funcao que efetua a divisao
        if (divisor == 0) {
            throw new ArithmeticException("Não é permitido divisão por zero!");
        }
        resultado = dividendo/divisor;
        return resultado;
    }

    public double calcularResto() { //Funcao que calcula o resto da divisao
        resto = dividendo % divisor;
        return resto;
    }

    @Override
    public void info() {
        System.out.println("Divisão: " + dividendo + " / " + divisor + " = " + resultado + " - Resto: " + calcularResto());
    }
}