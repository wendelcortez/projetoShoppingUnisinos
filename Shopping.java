package validadoretapa;
import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Métodos de acesso dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
    }

    // Método insereLoja
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // Método removeLoja
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // Método quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getClass().getSimpleName().equals(tipoLoja)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    // Método lojaSeguroMaisCaro
    public Loja lojaSeguroMaisCaro() {
        double maiorValorSeguro = 0;
        Loja lojaMaisCara = null;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                double valorSeguro = informatica.getValorSeguroEletronicos();
                if (valorSeguro > maiorValorSeguro) {
                    maiorValorSeguro = valorSeguro;
                    lojaMaisCara = loja;
                }
            }
        }
        return lojaMaisCara;
    }
}
