package validadoretapa;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    // Construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    // Método de acesso Get e Set
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Alimentacao [dataAlvara=" + dataAlvara + ", " + super.toString() + "]";
    }
}
