package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HistoricoCalculos historico = new HistoricoCalculos(); //Instanciacao da classe HistoricoCalculos
        Calculadora calculadora; //A classe Calculadora apenas consta como referencia, mas nao foi instanciada
        boolean executando = true; //Variavel utilizando para executar o loop, ao menos, uma vez e continuar enquanto a condicao for verdadeira

        do {
            try {
                System.out.println("----------------------------");
                System.out.println("APP Calculadora"); //Menu principal
                System.out.println("1. Efetuar cálculos");
                System.out.println("2. Consultar seu histórico de cálculos");
                System.out.println("0. Encerrar o programa");
                System.out.print("Digite a sua opção: ");
                int opcao = scanner.nextInt(); //A opcao é armazenada na variavel e o programa seguira de acordo com a que for escolhida
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("----------------------------");
                        System.out.println("Qual cálculo deseja realizar?"); //Menu de escolha das operacoes matematicas
                        System.out.println("1. Adição");
                        System.out.println("2. Subtração");
                        System.out.println("3. Multiplicação");
                        System.out.println("4. Divisão");
                        System.out.println("5. Potência");
                        System.out.println("6. Raiz Quadrada");
                        System.out.println("0. Retornar ao menu principal");
                        System.out.print("Digite a sua opção: ");
                        int opcaoCalculo = scanner.nextInt(); //A opcao de calculo é armazenada na variavel e o programa seguira de acordo com o calculo escolhido

                        switch (opcaoCalculo) {
                            case 1:
                                System.out.println("----------------------------");
                                System.out.print("Digite a primeira parcela: ");
                                double parcela1 = scanner.nextDouble();
                                System.out.print("Digite a segunda parcela: ");
                                double parcela2 = scanner.nextDouble();

                                calculadora = new Adicao(parcela1, parcela2); //A classe Adicao foi instanciada para chamar as funcoes calcular() e info()
                                calculadora.calcular(); //Efetua o calculo da operacao
                                calculadora.info(); //Mostra o resultado da operacao em tela
                                historico.adicionar(calculadora); //Adiciona o calculo no ArrayList de historico
                                break;
                            case 2:
                                System.out.println("----------------------------");
                                System.out.print("Digite o minuendo: ");
                                double minuendo = scanner.nextDouble();
                                System.out.print("Digite subtraendo: ");
                                double subtraendo = scanner.nextDouble();

                                calculadora = new Subtracao(minuendo, subtraendo); //A classe Subtracao foi instanciada para chamar as funcoes calcular() e info()
                                calculadora.calcular(); //Efetua o calculo da operacao
                                calculadora.info(); //Mostra o resultado da operacao em tela
                                historico.adicionar(calculadora); //Adiciona o calculo no ArrayList de historico
                                break;
                            case 3:
                                System.out.println("----------------------------");
                                System.out.print("Digite o primeiro fator: ");
                                double fator1 = scanner.nextDouble();
                                System.out.print("Digite o segundo fator: ");
                                double fator2 = scanner.nextDouble();

                                calculadora = new Multiplicacao(fator1, fator2); //A classe Multiplicacao foi instanciada para chamar as funcoes calcular() e info()
                                calculadora.calcular(); //Efetua o calculo da operacao
                                calculadora.info(); //Mostra o resultado da operacao em tela
                                historico.adicionar(calculadora); //Adiciona o calculo no ArrayList de historico
                                break;
                            case 4:
                                try {
                                    System.out.println("----------------------------");
                                    System.out.print("Digite o dividendo: ");
                                    double dividendo = scanner.nextDouble();
                                    System.out.print("Digite o divisor: ");
                                    double divisor = scanner.nextDouble();

                                    calculadora = new Divisao(dividendo, divisor); //A classe Divisao foi instanciada para chamar as funcoes calcular() e info()
                                    calculadora.calcular(); //Efetua o calculo da operacao
                                    calculadora.info(); //Mostra o resultado da operacao em tela
                                    historico.adicionar(calculadora); //Adiciona o calculo no ArrayList de historico
                                } catch (ArithmeticException e) {
                                    System.out.println("----------------------------");
                                    System.out.println("Erro: Não é permitido divisão por zero!");
                                }
                                break;
                            case 5:
                                System.out.println("----------------------------");
                                System.out.print("Digite a base: ");
                                double base = scanner.nextDouble();
                                System.out.print("Digite o expoente: ");
                                double expoente = scanner.nextDouble();

                                calculadora = new Potencia(base, expoente); //A classe Potencia foi instanciada para chamar as funcoes calcular() e info()
                                calculadora.calcular(); //Efetua o calculo da operacao
                                calculadora.info(); //Mostra o resultado da operacao em tela
                                historico.adicionar(calculadora); //Adiciona o calculo no ArrayList de historico
                                break;
                            case 6:
                                try {
                                    System.out.println("----------------------------");
                                    System.out.print("Digite o radicando: ");
                                    double radicando = scanner.nextDouble();

                                    calculadora = new RaizQuadrada(radicando); //A classe Raiz Quadrada foi instanciada para chamar as funcoes calcular() e info()
                                    calculadora.calcular(); //Efetua o calculo da operacao
                                    calculadora.info(); //Mostra o resultado da operacao em tela
                                    historico.adicionar(calculadora); //Adiciona o calculo no ArrayList de historico
                                } catch (IllegalArgumentException e) {
                                    System.out.println("----------------------------");
                                    System.out.println("Erro: Não é possível calcular raiz quadrada de números negativos!");
                                }
                                break;
                            case 0:
                                break; //Retorna ao menu principal
                            default:
                                System.out.println("Opção Inválida. Tente novamente!");
                        }
                        break;
                    case 2:
                        historico.listarHistorico(); //Lista todos os calculos armazenados no historico
                        break;
                    case 0:
                        executando = false; //A variavel executando e atualizando para false, o que acarreta na saida do loop e encerramento do programa
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção Inválida. Tente novamente!");
                }
            } catch (InputMismatchException e) {
                System.out.println("----------------------------");
                System.out.println("Erro: Favor inserir apenas números!");
                scanner.nextLine();
            }
        } while(executando);
        scanner.close();
    }
}