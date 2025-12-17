package calculadora;

public class RaizQuadrada extends Calculadora {
    double radicando;

    public RaizQuadrada(double radicando) {
        this.radicando = radicando;
    }

    @Override
    public double calcular() {//Funcao que efetua o calculo da raiz quadrada
        if (radicando < 0) {
            throw new IllegalArgumentException("Não existe raíz real para números negativos.");
       }
       resultado = Math.sqrt(radicando);
       return resultado;
    }

    @Override
    public void info() {
        System.out.println("Raiz Quadrada: √" + radicando + " = " + resultado);
    }
}
