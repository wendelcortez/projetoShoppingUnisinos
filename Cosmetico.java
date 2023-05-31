package validadoretapa;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    // Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Método de acesso Get e Set
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Cosmetico [taxaComercializacao=" + taxaComercializacao + ", " + super.toString() + "]";
    }
}
