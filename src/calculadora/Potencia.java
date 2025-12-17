package calculadora;

public class Potencia extends Calculadora {
    double base;
    double expoente;

    public Potencia(double base, double expoente) {
        this.base = base;
        this.expoente = expoente;
    }

    @Override
    public double calcular() { //Funcao que efetua o calculo da potencia com a base e o expoente
        resultado = Math.pow(base, expoente);
        return resultado;
    }

    @Override
    public void info() {
        System.out.println("Potência: " + base + " ^ " + expoente + " = " + resultado);
    }
}
