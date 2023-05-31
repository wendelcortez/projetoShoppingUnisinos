package validadoretapa;

public class Bijuteria extends Loja {
    private double metaVendas;

    // Construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    // Método de acesso Get e Set
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Bijuteria [metaVendas=" + metaVendas + ", " + super.toString() + "]";
    }
}
