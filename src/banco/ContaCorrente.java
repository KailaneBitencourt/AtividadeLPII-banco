package banco;
import operacao.Operacao;

public class ContaCorrente {
    private double valor = 0;

    public void executarOperacao(Operacao opr){
        valor += opr.operar();
    }

    public double getSaldo(){
        return valor;
    }
}
