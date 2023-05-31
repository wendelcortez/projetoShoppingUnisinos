package validadoretapa;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    // Construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    // Método de acesso Get e Set
    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Vestuario [produtosImportados=" + produtosImportados + ", " + super.toString() + "]";
    }
}
