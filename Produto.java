package validadoretapa;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    // Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Métodos de acesso Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método para verificar se o produto está vencido
    public boolean estaVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno()) {
            return true;
        } else if (dataValidade.getAno() == dataAtual.getAno()) {
            if (dataValidade.getMes() < dataAtual.getMes()) {
                return true;
            } else if (dataValidade.getMes() == dataAtual.getMes()) {
                return dataValidade.getDia() < dataAtual.getDia();
            }
        }
        return false;
    }

    // Método toString atualizado
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", dataValidade=" + dataValidade + "]";
    }
}
