package calculadora;

import java.util.ArrayList;

public class HistoricoCalculos { //Classe para adicionar e armazenar o historico de calculos no ArrayList
    private ArrayList <Calculadora> historico;

    public HistoricoCalculos() {
        this.historico = new ArrayList<>();
    }

    public void adicionar(Calculadora calculadora) { //Funcao para adicionar os calculos no registro
        historico.add(calculadora);
    }

    public void listarHistorico() { //Funcao para listar todos os calculos efetuados enquanto o programa executado
        System.out.println("----------------------");
        System.out.println("Histórico de Cálculos:");
        for(Calculadora calculadora : historico) {
            calculadora.info();
        }
    }
}