package calculadora;

/*
 *
 * @author: Andre Carvalho de Souza
 *
 */

public abstract class Calculadora { //Classe abstrata, portanto nao sera instanciada
    protected double resultado;

    public abstract double calcular(); //funcao para fazer o calculo, devendo ser implementada nas classes filhas
    public abstract void info(); //funcao para apresentar os detalhes do calculo, sendo os operandos e o resultado
}